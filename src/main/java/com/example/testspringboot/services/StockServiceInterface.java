package com.example.testspringboot.services;

import java.time.LocalDateTime;

public interface StockServiceInterface {
    String getId();
    float getExchangeRate(String stock, LocalDateTime date);
}
