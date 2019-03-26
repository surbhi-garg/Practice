package com.demo.thymeleaf.controller;

import com.demo.thymeleaf.employee.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@Controller
public class ApplicationController {

    //Question1
    @GetMapping("/form")
    public String form() {
        return "form";
    }

    //Question2
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    //Question5
    @GetMapping("/user/greet")
    public String greet(Model model) {
        model.addAttribute("isAdmin", true);
        return "/user/greet";
    }

    //    Question7
    @GetMapping("/getServerTime")
    @ResponseBody
    public LocalTime getServerTime() {
        return LocalTime.now();
    }

    @GetMapping("/serverTime")
    public String serverTime() {
        return "serverTime";
    }

    //    Question8
    @GetMapping("/user/list")
    public String userList(Model model)
    {
        List<String>users= Arrays.asList("Surbhi Garg","Vagish Dixit","Reshma Mohan","Yukti Sharma");
        model.addAttribute("userList",users);
        return "/user/list";
    }

}
