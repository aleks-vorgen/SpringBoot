package com.example.testspringboot.controllers;

import com.example.testspringboot.services.StockServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "/demo")
public class StockController {

    private List<StockServiceInterface> services;

    public StockController(List<StockServiceInterface> services) {
        this.services = services;
    }

    @RequestMapping(path = "/stock")
    public ResponseEntity<?> test (@RequestParam(defaultValue = "APPLE") String id) {
        for(StockServiceInterface service : services) {
            service.getExchangeRate(id, LocalDateTime.now());
        }
        return ResponseEntity.ok("OK");
    }
}
