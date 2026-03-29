package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("myBean")
public class GreetingService {

    public void sayHEllo(){
        System.out.println("HEllow from spring");
    }
}
