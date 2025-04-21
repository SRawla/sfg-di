package com.example.sfg_di.controller;

import com.example.sfg_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectorControllerTest { //MOst preferred injector

    ConstructorInjectorController controller;

    @BeforeEach
    public void setup(){
        controller = new ConstructorInjectorController(new GreetingServiceImpl());

    }
    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetingService());
    }
}