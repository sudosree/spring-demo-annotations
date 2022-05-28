package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HockeyJavaConfigDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(HockeyJavaConfigDemoApp.class, args);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HockeyConfig.class);
        Coach coach = context.getBean("hockeyCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
