package com.example.UserManagementSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Entity {
    @Bean
    public List<User> getDataSource(){
        return new ArrayList<>();
    }

}
