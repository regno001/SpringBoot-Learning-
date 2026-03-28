package com.example.SpringFrameworkProject;

public class SmsService implements NotificationUser{
    public void send(String message){
        System.out.println("SMS: "+ message);
    }
}