package com.demo.thymeleaf.employee.Controller;

import com.demo.thymeleaf.employee.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/registrationForm")
    public String registrationForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "/employee/registrationForm";
    }

    @PostMapping("/registrationForm")
    public ModelAndView registeredDetails(@ModelAttribute Employee employee) {
        ModelAndView modelAndView = new ModelAndView("/employee/registered");
        modelAndView.addObject("firstName", employee.getFirstName());
        modelAndView.addObject("lastName", employee.getLastName());
        return modelAndView;
    }
    //    Question10
    @RequestMapping(value = "/registrationFormAjax",method = RequestMethod.POST)
    @ResponseBody
    public String register(@ModelAttribute Employee employee) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Info"+employee.getFirstName());
        return employee.getFirstName();

    }

    //Question4
    @GetMapping("/table")
    public String listEmployees(Model model) {
        model.addAttribute("employeeList", Arrays.asList(new Employee("Surbhi", "Garg"), new Employee("Vagish", "Dixit")));
        return "/employee/table";
    }
}
