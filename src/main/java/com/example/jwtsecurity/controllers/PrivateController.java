package com.example.jwtsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
class PrivateController {
    @GetMapping
    public String getMessage() {
        return "Hello from private API controller";
    }
}