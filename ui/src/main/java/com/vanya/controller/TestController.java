package com.vanya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class TestController {

    @Autowired
    private Temp<Integer, String> first;
    @Autowired
    private Temp<String, Integer> second;

    @RequestMapping("/api/test")
    public ResponseEntity<?> getTestValue() {
        return ResponseEntity.ok("TTTT");
    }

    @PostConstruct
    public void z() {
        first.setA(213);
        second.setA("asdasd");
        first.print();
        second.print();
    }
}
