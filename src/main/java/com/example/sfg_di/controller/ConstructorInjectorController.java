package com.example.sfg_di.controller;

import com.example.sfg_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
@Controller
public class ConstructorInjectorController {

    private final GreetingService service;

    public ConstructorInjectorController(@Qualifier("constructorGreetingServiceImpl")GreetingService service) {
        this.service = service;
    }

    public String getGreetingService(){
        return service.sayGreeting();
    }
}
