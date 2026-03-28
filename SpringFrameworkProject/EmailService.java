package com.example.SpringFrameworkProject;

public class EmailService implements NotificationUser{


    public void send(String message) {
        System.out.println("Email:" + message);
    }
}