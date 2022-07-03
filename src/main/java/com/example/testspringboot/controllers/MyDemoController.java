package com.example.testspringboot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "demo")
public class MyDemoController {

    @RequestMapping(path = "test")
    public ResponseEntity<?> test (@RequestParam(defaultValue = "NoName") String name) {
        return ResponseEntity.ok("Hello" + name);
    }
}
