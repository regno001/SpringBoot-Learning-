package com.example.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("SmsService")
public class UserService {
   //@Autowired
    NotificationUser notificationUser;

//    @Autowired
//    public UserService(@Qualifier("EmailService") NotificationUser notificationUser) {
//        this.notificationUser = notificationUser;
//    }
    @Autowired
    public UserService( NotificationUser notificationUser) {
        this.notificationUser = notificationUser;
    }


    public void notifyUser(String message){
        notificationUser.send("Notification hellow");
    }

    public UserService() {
    }

    public void setNotificationUser(NotificationUser notificationUser) {
        this.notificationUser = notificationUser;
    }
}