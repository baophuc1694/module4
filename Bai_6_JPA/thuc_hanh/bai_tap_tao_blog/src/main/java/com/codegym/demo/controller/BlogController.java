package com.codegym.demo.controller;

import com.codegym.demo.model.Blog;
import com.codegym.demo.repository.BlogRepository;
import com.codegym.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping("/")
    public String index(Model model, @PageableDefault(size = 3) Pageable pageable, @RequestParam Optional<String> keyword){
        String keywordAfterCheck = "";
        if (!keyword.isPresent()){
            model.addAttribute("listBlog", this.blogRepository.findAll(pageable));
        }else {
            keywordAfterCheck = keyword.get();
            model.addAttribute("listBlog", this.blogRepository.findByNamePostContaining(keyword, pageable));
        }
        model.addAttribute("keywordAfterCheck", keywordAfterCheck);
        return "/index";
    }

    @GetMapping("/blog/create")
    public String create(Model model){
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/blog/save")
    public String save(Model model, @ModelAttribute Blog blogObj, RedirectAttributes redirectAttributes){
        this.blogRepository.save(blogObj);
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/";
    }

    @GetMapping("/blog/edit")
    public String showUpdate(@RequestParam Integer id, Model model){
        model.addAttribute("blog", blogRepository.findById(id));
        return "edit";
    }

    @PostMapping("/blog/update")
    public String save(@ModelAttribute Blog blogObj, RedirectAttributes redirectAttributes){
        this.blogRepository.save(blogObj);
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/";
    }
}
