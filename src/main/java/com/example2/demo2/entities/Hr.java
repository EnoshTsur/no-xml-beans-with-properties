package com.example2.demo2.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hr implements Employee {

    @Autowired
    @Qualifier("hrMeetingService")
    private MeetingService meetingService;

    @Override
    public int getSalary() {
        return 10000;
    }

    public MeetingService getMeetingService() {
        return meetingService;
    }
}
