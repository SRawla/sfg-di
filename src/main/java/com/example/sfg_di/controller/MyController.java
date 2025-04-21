package com.example.sfg_di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hi , this is Copilot");
        return "hello folks";
    }
}
