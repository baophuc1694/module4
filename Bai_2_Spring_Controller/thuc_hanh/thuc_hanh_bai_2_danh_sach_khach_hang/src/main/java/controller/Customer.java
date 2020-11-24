package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Customer {

    @GetMapping("/customers/{id}")
    public ModelAndView showInfomation(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("customers/info");
    }
}
