package com.example.sfg_di.controller;

import com.example.sfg_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class SetterController {


    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingServiceImpl")
    @Autowired
    public void setGreetingService(GreetingService service){
        greetingService = service;
    }

    public String getGreetingService(){
        return greetingService.sayGreeting();
    }
}
