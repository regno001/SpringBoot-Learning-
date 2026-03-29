package com.example.Annotation;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements NotificationUser{
    public void send(String message){
        System.out.println("SMS: "+ message);
    }
}