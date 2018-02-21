package com.vanya.controller;

import client.LoadFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/truck")
public class TestController {

    @Autowired
    private LoadFeignClient loadFeignClient;

    @RequestMapping
    public ResponseEntity<?> getTestResponseFromLoad(){
        return ResponseEntity.ok(loadFeignClient.greeting());
    }
}
