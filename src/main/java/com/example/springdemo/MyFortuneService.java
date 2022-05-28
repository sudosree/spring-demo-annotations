package com.example.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class MyFortuneService implements FortuneService {

    public MyFortuneService() {
        System.out.println("MyFortuneService: Inside no-args constructor");
    }

    @Override
    public String getFortune() {
        return "My Fortune is really awesome!!!!!";
    }
}
