package com.example2.demo2.entities;

import org.springframework.stereotype.Component;

@Component
public class DevMeetingService implements MeetingService {

    @Override
    public String getMeetingContext() {
        return "Working on web spring app";
    }
}
