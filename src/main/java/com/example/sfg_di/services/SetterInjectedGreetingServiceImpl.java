package com.example.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi ! this is Setter injected Greeting Service.";
    }
}
