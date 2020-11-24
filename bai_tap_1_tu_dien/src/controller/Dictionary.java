package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryServiceImpl;

@Controller
public class Dictionary {

    @Autowired
    private DictionaryServiceImpl dictionaryService;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/trun")
    public String house(@RequestParam String word, Model model){
        model.addAttribute("result", dictionaryService.translation(word));
        return "result";
    }

}
