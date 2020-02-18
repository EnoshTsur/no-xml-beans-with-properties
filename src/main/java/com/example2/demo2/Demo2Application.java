package com.example2.demo2;

import com.example2.demo2.configuration.EmployeeConfiguration;
import com.example2.demo2.entities.Dev;
import com.example2.demo2.entities.Hr;
import com.example2.demo2.entities.QA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo2Application.class, args);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EmployeeConfiguration.class);

        Dev dev = context.getBean(Dev.class);
        QA qa = context.getBean(QA.class);
        Hr hr = context.getBean(Hr.class);

        System.out.printf("QA: %d\n", qa.getSalary());
        System.out.printf("HR: %d\n", hr.getSalary());
        System.out.printf("Dev: %d\n", dev.getSalary());

        System.out.printf("Dev Service: %s\n", dev.getMeetingService().getMeetingContext());
        System.out.printf("Qa Service: %s\n", qa.getMeetingService().getMeetingContext());
        System.out.printf("Dev Service: %s\n", hr.getMeetingService().getMeetingContext());
    }

}
