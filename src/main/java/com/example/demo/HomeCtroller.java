package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtroller {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar", "Hello NewYear.");
        model.addAttribute("myvar2", "happy");
        return "hometemplate";
    }

}
