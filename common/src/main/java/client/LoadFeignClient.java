package client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("load-service")
public interface LoadFeignClient {
    @RequestMapping("/")
    String greeting();
}
