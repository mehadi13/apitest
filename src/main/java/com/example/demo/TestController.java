package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    // This is a simple test controller
    // You can add request mapping methods here to handle HTTP requests
    // For example:

     @GetMapping("/test")
     public String testEndpoint() {
         return "This is a test endpoint";
     }

    @GetMapping
    public String home() {
        return "This is a home endpoint";
    }
}
