package com.example.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi, this is Property Injected GreetingService.";
    }
}
