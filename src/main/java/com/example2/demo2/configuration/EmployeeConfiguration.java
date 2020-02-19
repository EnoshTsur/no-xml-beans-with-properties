package com.example2.demo2.configuration;

import com.example2.demo2.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:enosh.properties")
public class EmployeeConfiguration {

    @Bean
    public MeetingService sadMeetingService(){
        return new GraphicsMeetingService();
    }

    @Bean
    public MeetingService climberMeetingService(){
        return new ClimberMeetingService();
    }

    @Bean
    public Employee graphics(){
        return new Graphics(sadMeetingService());
    }

    @Bean
    public Employee climber(){
        return new Climber("Enosh", climberMeetingService());
    }



}
