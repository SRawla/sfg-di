package com.example.sfg_di.controller;

import com.example.sfg_di.services.GreetingService;
import org.springframework.stereotype.Controller;
@Controller
public class ConstructorInjectorController {

    private final GreetingService service;

    public ConstructorInjectorController(GreetingService service) {
        this.service = service;
    }

    public String getGreetingService(){
        return service.sayGreeting();
    }
}
