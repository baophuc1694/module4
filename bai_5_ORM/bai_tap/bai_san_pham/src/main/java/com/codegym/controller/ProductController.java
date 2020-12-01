package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.Impl.ProductServiceImpl;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {

@Autowired
private ProductServiceImpl productServiceImpl;
    @GetMapping("/")
    public String index(Model model){
        List<Product> productList =productServiceImpl.findAll();
        model.addAttribute("products", productList);
        return "/index";
    }

    @GetMapping("/product/create")
    public String create(Model model){
        model.addAttribute("product", new Product());
        return "/create";
    }
    @PostMapping("/product/save")
    public String save(Model model, @ModelAttribute Product productObj, RedirectAttributes redirectAttributes) {
        this.productServiceImpl.save(productObj);
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/";
    }

    @PostMapping("/product/update")
    public String update(Product product, RedirectAttributes  redirectAttributes){
        productServiceImpl.update(product.getId(), product );
        redirectAttributes.addFlashAttribute("message", "Update success");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/edit")
    public String showFormEdit(Model model, @PathVariable int id){
        model.addAttribute("product", productServiceImpl.findById(id));
        return "/edit";
    }

    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("product", productServiceImpl.findById(id));
        return "/delete";
    }

    @PostMapping("product/delete")
    public String delete(Product product, RedirectAttributes redirectAttributes){
        productServiceImpl.remove(product.getId());
        redirectAttributes.addFlashAttribute("message", "Delete success");
        return "redirect:/";
    }
}
