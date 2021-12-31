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
        System.out.printf("1123");
        int a = 3;
        int b = 6;
        System.out.printf("teste");
        return "asdfasdf";
    }

    public void add1(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }

    public void add2(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }
}
