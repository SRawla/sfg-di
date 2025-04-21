package com.example.sfg_di.controller;

import com.example.sfg_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {

    @Autowired
    public  GreetingService service;

    public String getGreetingService(){
        return service.sayGreeting();
    }
}
