package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.Iml.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/")
    public String index(Model model){
        List customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "/index";
    }

    @GetMapping("/customer/create")
    public String create(Model model){
        model.addAttribute("customer", new Customer());
        return "/create";
    }

    @PostMapping("/customer/save")
    public String save(Customer customer, RedirectAttributes redirectAttributes){
        customer.setId((int) (Math.random() * 1000));
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message","success");
        return "redirect:/";
    }

    @PostMapping("/customer/update")
    public String update(Customer customer, RedirectAttributes  redirectAttributes){
        customerService.update(customer.getId(), customer );
        redirectAttributes.addFlashAttribute("message", "Update success");
        return "redirect:/";
    }

    @GetMapping("/customer/{id}/edit")
    public String showFormEdit(Model model, @PathVariable int id){
        model.addAttribute("customer", customerService.findById(id));
        return "/edit";
    }

    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "/delete";
    }

    @PostMapping("customer/delete")
    public String delete(Customer customer, RedirectAttributes redirectAttributes){
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("message", "Delete success");
        return "redirect:/";
    }

    @GetMapping("/customer/{id}/view")
    public String view(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "/view";
    }

}

