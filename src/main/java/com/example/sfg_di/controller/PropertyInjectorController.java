package com.example.sfg_di.controller;

import com.example.sfg_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {

    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    public  GreetingService service;

    public String getGreetingService(){
        return service.sayGreeting();
    }
}
