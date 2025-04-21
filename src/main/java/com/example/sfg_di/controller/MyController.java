package com.example.sfg_di.controller;

import com.example.sfg_di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    MyController(GreetingService service){
        greetingService = service;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
