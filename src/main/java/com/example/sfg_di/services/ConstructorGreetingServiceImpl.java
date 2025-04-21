package com.example.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello , greeting from Constructor greeting Service.";
    }
}
