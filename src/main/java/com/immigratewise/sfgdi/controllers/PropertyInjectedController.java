package com.immigratewise.sfgdi.controllers;

import com.immigratewise.sfgdi.services.GreetingServices;

public class PropertyInjectedController {
    public GreetingServices greetingServices;
    public String getGreeting(){
        return greetingServices.sayGreeting();
    }

}
