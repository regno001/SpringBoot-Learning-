package com.example.demo;

import com.example.Annotation.AppConfig;
import com.example.Annotation.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService= (GreetingService) context.getBean(GreetingService.class);
        greetingService.sayHEllo();

        UserService userService= (UserService) context.getBean(UserService.class);
        userService.notifyUser("Whats up");
    }


}
