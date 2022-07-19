package com.example.testspringboot.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Primary
public class NYSEService implements StockServiceInterface {
    @Override
    public String getId() {
        return "NYSE";
    }

    @Override
    public float getExchangeRate(String stock, LocalDateTime date) {
        System.out.println("NYSE works.\nStock name: " + stock + "; time: " + date);
        return 0;
    }
}
