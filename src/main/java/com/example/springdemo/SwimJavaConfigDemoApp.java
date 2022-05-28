package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(SwimJavaConfigDemoApp.class, args);

        // read the spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from the spring container
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());

        // close the context
        context.close();
    }
}
