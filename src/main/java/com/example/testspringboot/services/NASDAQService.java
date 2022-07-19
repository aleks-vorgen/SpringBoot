package com.example.testspringboot.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NASDAQService implements StockServiceInterface {
    @Override
    public String getId() {
        return "NASDAQ";
    }

    @Override
    public float getExchangeRate(String stock, LocalDateTime date) {
        System.out.println("NASDAQ works.\nStock name: " + stock + "; time: " + date);
        return 0;
    }
}
