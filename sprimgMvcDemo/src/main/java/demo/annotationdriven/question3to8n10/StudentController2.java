package demo.annotationdriven.question3to8n10;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller

//for Question4
@RequestMapping("/student2")
public class StudentController2 {
    @RequestMapping("/")
    String index()
    {
        return "index";
    }

    //question4
    @ResponseBody
    @RequestMapping("/hello")
    String helloWorld()
    {
        return "Hello World";
    }

    //question5
    @RequestMapping("/sendModel")
    ModelAndView sendModel()
    {
        ModelAndView modelAndView=new ModelAndView("dummy");
        modelAndView.addObject("message","Hello world");
        return modelAndView;
    }

    //question6
    @ResponseBody
    @RequestMapping("/displayMyName/{firstName}/{lastName}")
    String fullName(@PathVariable("firstName")String firstName,@PathVariable("lastName")String lastName)
    {
        return firstName+" "+lastName;
    }

    //question7
    @ResponseBody
    @RequestMapping("/displayFullName/{firstName}/{lastName}")
    String firstNameAndLastName(@PathVariable Map<String,String> inputMap)
    {
        return inputMap.get("firstName")+" "+inputMap.get("lastName");
    }

    //Question8
    @RequestMapping("/form")
    ModelAndView studentForm()
    {
        return new ModelAndView("studentform");
    }
    @ResponseBody
    @RequestMapping(value = "/submitForm",method = RequestMethod.POST)
    String formData(@RequestParam("fname")String firstName,@RequestParam("lname")String lastName)
    {
        return firstName+" "+lastName;
    }

    //Question10
    @ModelAttribute
    void addObject(Model model)
    {
        model.addAttribute("heading","Spring MVC Demo");
    }

}
