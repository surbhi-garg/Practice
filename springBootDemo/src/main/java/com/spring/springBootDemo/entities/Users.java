package com.spring.springBootDemo.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Users {
    private String username;
    private String password;

    Logger logger= LoggerFactory.getLogger(Users.class);
    public Users() {
        logger.info("User Bean Created");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
