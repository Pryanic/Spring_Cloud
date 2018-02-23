var webpack = require('webpack');
var proxy = require('express-http-proxy');
var webpackDevMiddleware = require('webpack-dev-middleware');
var webpackHotMiddleware = require('webpack-hot-middleware');
var config = require('./webpack.dev.config');

var app = new (require('express'))();
var port = 8081;

var compiler = webpack(config);
app.use(webpackDevMiddleware(compiler, {
  noInfo: true,
  publicPath: config.output.publicPath,
  devServer: config.devServer,
}));
app.use(webpackHotMiddleware(compiler));

app.use('/*/api', proxy('http://94.130.69.245:8545', {
  proxyReqPathResolver: req => req.originalUrl,
  preserveHostHdr: true,
}));

app.get('/*', (req, res) => {
  res.sendFile(__dirname + '/index.html');
});

app.listen(port, function(error) {
  if (error) {
    console.error(error);
  } else {
    console.info('Open up http://localhost:%s/ in your browser.', port, port);
  }
});
