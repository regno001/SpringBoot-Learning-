package com.example.Annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements NotificationUser{
    public void send(String message) {
        System.out.println("Email:" + message);
    }
}