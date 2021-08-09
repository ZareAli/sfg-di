package com.immigratewise.sfgdi.controllers;

import com.immigratewise.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServices greetingServices;

    public String getGreeting(){
        return greetingServices.sayGreeting();
    }

}
