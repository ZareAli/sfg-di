package com.immigratewise.sfgdi.controllers;

import com.immigratewise.sfgdi.services.ConstructorGreetingServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServices());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}