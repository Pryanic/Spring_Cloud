package com.vanya.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/load")
public class TestController {

    @Value("${text.greeting: Default Copyright}")
    private String copyright;

    @GetMapping("/")
    public ResponseEntity<?> getMessage() {
        return ResponseEntity.ok(copyright);
    }

    @GetMapping("/{loadId}")
    public ResponseEntity<?> getLoad(@PathVariable Long loadId) {
        return ResponseEntity.ok(loadId);
    }
}
