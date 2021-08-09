package com.immigratewise.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello Spring!");
        return "Hi Folks";
    }
}
