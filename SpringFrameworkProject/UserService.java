package com.example.SpringFrameworkProject;

public class UserService {
    NotificationUser notificationUser;

    public UserService (NotificationUser notificationUser){
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