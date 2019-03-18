package com.spring.springBootDemo.services;

import com.spring.springBootDemo.entities.Database;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.server.LoaderHandler;

@Service
public class DatabaseService {
    @Autowired
    Database database;
    Logger logger= LoggerFactory.getLogger(DatabaseService.class);
    public String getDataBaseConfig()
    {
        //Question6
        logger.info(".......In studentService.getDataBaseConfig method.........");
        return database.getName()+" "+database.getPort();
    }
}
