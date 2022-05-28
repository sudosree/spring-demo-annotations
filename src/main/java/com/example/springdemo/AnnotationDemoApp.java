package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AnnotationDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(AnnotationDemoApp.class, args);

        // read the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from the spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        SwimmingCoach swimmingCoach = context.getBean("swimmingCoach", SwimmingCoach.class);

        // call a method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        System.out.println(swimmingCoach.getDailyWorkout());
        System.out.println(swimmingCoach.getDailyFortune());
        System.out.println(swimmingCoach.getEmail());
        System.out.println(swimmingCoach.getTeam());

        // close the context
        context.close();
    }
}
