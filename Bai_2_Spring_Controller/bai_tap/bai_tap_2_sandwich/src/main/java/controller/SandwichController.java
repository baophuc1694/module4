package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping
    public String home(){
        return "home";
    }

    @PostMapping({"","/save"})
    public String save(@RequestParam("condiment") String[] condiment, Model model){
        StringBuilder result = new StringBuilder();

        if (condiment.length == 0){
            result.append("Not Condiment !");
            model.addAttribute("result", result);
            return "home";
        }
        for (int i=0; i<condiment.length; i++){
            if (i < condiment.length - 2
            ){
                result.append(condiment[i]).append(",");
            }else {
                result.append(condiment[i]);
            }
        }
        model.addAttribute("result", "Your List: " + result.toString());
        return "home";
    }
}
