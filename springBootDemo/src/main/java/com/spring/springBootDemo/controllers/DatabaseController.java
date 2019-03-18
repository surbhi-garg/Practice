package com.spring.springBootDemo.controllers;

import com.spring.springBootDemo.entities.Database;
import com.spring.springBootDemo.services.DatabaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DatabaseController {
    @Autowired
    DatabaseService databaseService;

    Logger logger= LoggerFactory.getLogger(DatabaseController.class);

    @RequestMapping("/databaseConfig")
    public String databaseConfig()
    {
        //Question6
        logger.info("------Calling databaseService.getDataBaseConfig()-------");
        return databaseService.getDataBaseConfig();
    }


}
