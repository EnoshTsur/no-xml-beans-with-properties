package com.example2.demo2.entities;

public class Graphics implements Employee{

    private MeetingService meetingService;

    public Graphics(MeetingService meetingService) {
        this.meetingService = meetingService;
    }

    @Override
    public int getSalary() {
        return 12000;
    }

    public String getMeetingContext(){
        return meetingService.getMeetingContext();
    }
}
