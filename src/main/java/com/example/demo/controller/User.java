package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class User {

    @GetMapping("/geta")
    @ResponseBody
    public String get(){
        sayHello();
        return "asdfasdf";
    }



    public void sayHello(){
        System.out.println("This one is say hello function");
    }
}

