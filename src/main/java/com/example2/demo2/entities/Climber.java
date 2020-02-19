package com.example2.demo2.entities;

import org.springframework.beans.factory.annotation.Value;

public class Climber implements Employee {


    private String name;
    private MeetingService meetingService;

    @Value("${enosh.email}")
    private String email;

    @Value("${enosh.sport}")
    private String sport;

    public Climber(String name, MeetingService meetingService) {
        this.name = name;
        this.meetingService = meetingService;
    }

    public String getName() {
        return name;
    }

    public MeetingService getMeetingService() {
        return meetingService;
    }

    public String getEmail() {
        return email;
    }

    public String getSport() {
        return sport;
    }

    @Override
    public int getSalary() {
        return 1000000;
    }
}
