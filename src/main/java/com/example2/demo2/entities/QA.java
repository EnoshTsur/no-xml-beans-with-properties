package com.example2.demo2.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class QA implements Employee {

    @Autowired
    @Qualifier("qaMeetingService")
    private MeetingService meetingService;

    @Override
    public int getSalary() {
        return 12000;
    }

    public MeetingService getMeetingService() {
        return meetingService;
    }
}
