package com.example.sfg_di.controller;

import com.example.sfg_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PropertyInjectorControllerTest {

    PropertyInjectorController propertyController;

    @BeforeEach
    void setUp(){
        propertyController = new PropertyInjectorController();
        propertyController.service = new GreetingServiceImpl();

    }
    @Test
    void getGreetingService() {
        System.out.println(propertyController.getGreetingService());
    }
}