package com.example.sfg_di.controller;

import com.example.sfg_di.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SetterControllerTest {

    SetterController controller;
    @BeforeEach
    void setUp(){
        controller = new SetterController();
        controller.setGreetingService(new ConstructorGreetingServiceImpl());

    }
    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetingService());
    }
}