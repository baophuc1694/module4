package com.codegym.demo.controller;

import com.codegym.demo.model.Blog;
import com.codegym.demo.service.BlogService;
import com.codegym.demo.service.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private BlogServiceImpl blogServiceImpl;

    @GetMapping("/")
    public String index(Model model){
        List<Blog> blogList = blogServiceImpl.findAll();
        model.addAttribute("blogs", blogList);
        return "/index";
    }
}
