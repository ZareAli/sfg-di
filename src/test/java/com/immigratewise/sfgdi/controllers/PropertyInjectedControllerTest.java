package com.immigratewise.sfgdi.controllers;

import com.immigratewise.sfgdi.services.ConstructorGreetingServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingServices = new ConstructorGreetingServices();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}