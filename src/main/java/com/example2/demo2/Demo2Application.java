package com.example2.demo2;

import com.example2.demo2.configuration.EmployeeConfiguration;
import com.example2.demo2.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo2Application.class, args);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EmployeeConfiguration.class);

        Graphics graphics = context.getBean("graphics", Graphics.class);
        Climber enosh = context.getBean("climber", Climber.class);


        System.out.println(enosh.getEmail());
        System.out.println(enosh.getSport());
        System.out.println(enosh.getName());
        System.out.println(enosh.getMeetingService().getMeetingContext());
    }

}
