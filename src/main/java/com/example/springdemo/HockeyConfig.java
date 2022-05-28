package com.example.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.example.springdemo")
public class HockeyConfig {

    @Bean
    public FortuneService myFortuneService() {
        return new MyFortuneService();
    }

    @Bean
    public Coach hockeyCoach() {
        return new HockeyCoach(myFortuneService());
    }

}
