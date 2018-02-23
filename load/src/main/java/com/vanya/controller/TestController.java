package com.vanya.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${text.greeting: Default Copyright}")
    private String copyright;

    @GetMapping("/api/load")
    @PreAuthorize(" hasRole('ROLE_USER')")
    public ResponseEntity<?> getMessage() {
        return ResponseEntity.ok(copyright);
    }

    @GetMapping("/api/load/{loadId}")
    public ResponseEntity<?> getLoad(@PathVariable Long loadId) {
        return ResponseEntity.ok(loadId);
    }
}
