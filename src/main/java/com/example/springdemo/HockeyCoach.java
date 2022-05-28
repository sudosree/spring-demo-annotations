package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class HockeyCoach implements Coach {

//    @Autowired
//    @Qualifier("myFortuneService")
    private FortuneService fortuneService;

    public HockeyCoach() {
        System.out.println("HockeyCoach: Inside no-args constructor");
    }

    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice hockey daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
