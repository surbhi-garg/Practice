package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/multi")
public class MultiAnnotationController {
    @RequestMapping("/hello")
    ModelAndView hello()
    {
        String msg="Surbhi";
        return new ModelAndView("index").addObject("msg",msg);
    }

    @RequestMapping("/dummy")
    ModelAndView dummy()
    {
        return new ModelAndView("dummy");
    }
}
