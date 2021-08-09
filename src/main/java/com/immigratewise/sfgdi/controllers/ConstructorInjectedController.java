package com.immigratewise.sfgdi.controllers;

import com.immigratewise.sfgdi.services.GreetingServices;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    GreetingServices greetingServices;

    public ConstructorInjectedController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
