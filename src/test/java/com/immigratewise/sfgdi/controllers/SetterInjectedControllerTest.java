package com.immigratewise.sfgdi.controllers;

import com.immigratewise.sfgdi.services.ConstructorGreetingServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingServices(new ConstructorGreetingServices());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}