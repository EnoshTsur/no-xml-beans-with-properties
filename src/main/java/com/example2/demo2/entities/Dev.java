package com.example2.demo2.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("developer")
public class Dev implements Employee {

    @Autowired
    @Qualifier("devMeetingService")
    private MeetingService meetingService;

    public Dev() { }

    public MeetingService getMeetingService() {
        return meetingService;
    }

    @Override
    public int getSalary() {
        return 16000;
    }



}
