package com.codegym.controller;

import com.codegym.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codegym.service.EmailService;

@Controller

public class EmailController {
    private String [] languages = {"English", "Vietnamese", "Japanese", "China"};
    private String [] pageSize = {"5", "10", "15", "25", "50", "100"};

@Autowired
private EmailService emailService;

    @GetMapping({"","home"})
    public String home( Model model){
        model.addAttribute("languages", languages);
        model.addAttribute("pageSize", pageSize);

        Email emailShowInfo = emailService.create();
        model.addAttribute("email", emailShowInfo);
        model.addAttribute("update", new Email());
        return "home";
    }
    @GetMapping("showUpdate")
    public String showUpdate(Model model) {
        model.addAttribute("languages", languages);
        model.addAttribute("pageSizes", pageSize);

        Email email = emailService.create();
        model.addAttribute("email", email);

        return "index";
    }

    @PostMapping("up")
    public String update(@ModelAttribute Email update, Model model) {
        model.addAttribute("languages", languages);
        model.addAttribute("pageSizes", pageSize);

        Email emailResult = emailService.update(update);
        model.addAttribute("email", emailResult);

        return "result";
    }
}
