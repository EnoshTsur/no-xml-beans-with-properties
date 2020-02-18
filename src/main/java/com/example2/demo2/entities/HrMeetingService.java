package com.example2.demo2.entities;

import org.springframework.stereotype.Component;

@Component
public class HrMeetingService implements MeetingService {

    @Override
    public String getMeetingContext() {
        return "Talk about employees salaries";
    }
}
