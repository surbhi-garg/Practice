package demo.annotationdriven.question9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student3")
public class StudentController3 {
    @RequestMapping("/")
    String form()
    {
        return "studentform2";
    }
    @RequestMapping("/submitFormData")
    @ResponseBody
    String getStudentDetails(StudentCO studentCO)
    {
        return studentCO.getFirstName()+" "+studentCO.getLastName();
    }
}
