package com.example.demo;

import org.springframework.context.annotation.Bean;


public class GreetingService {
    @Bean
    public void sayHEllo(){
        System.out.println("HEllow from spring");
    }
}
