package com.example.sfg_di.controller;

import com.example.sfg_di.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PropertyInjectorControllerTest {

    PropertyInjectorController propertyController;

    @BeforeEach
    void setUp(){
        propertyController = new PropertyInjectorController();
        propertyController.service = new ConstructorGreetingServiceImpl();

    }
    @Test
    void getGreetingService() {
        System.out.println(propertyController.getGreetingService());
    }
}