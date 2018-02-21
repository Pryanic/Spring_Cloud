package com.vanya.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/other")
public class OtherController {

    @GetMapping("/")
    public ResponseEntity<?> getText() {
        return ResponseEntity.ok("OTHER TEXT");
    }
}
