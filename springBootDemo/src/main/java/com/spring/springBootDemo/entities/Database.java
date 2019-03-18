package com.spring.springBootDemo.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Database {
    @Value("${database.name}")
    private String name;
    @Value("${database.port}")
    private int port;

    public String getName() {
        return name;
    }


    public int getPort() {
        return port;
    }

}
