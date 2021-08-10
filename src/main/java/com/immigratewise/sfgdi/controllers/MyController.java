package com.immigratewise.sfgdi.controllers;

import com.immigratewise.sfgdi.services.GreetingServices;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingServices greetingServices;

    public MyController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello(){
        return greetingServices.sayGreeting();
    }
}
