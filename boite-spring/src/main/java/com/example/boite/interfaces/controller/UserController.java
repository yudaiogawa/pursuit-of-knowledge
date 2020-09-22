package com.example.boite.interfaces.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("/input")
    public String index() {
        return "index.html";
    }

    @RequestMapping("/rslt")
    public String result(@RequestParam("userId") String userId, Model model) {
        String userName = "Alice";
        model.addAttribute("userId", userId);
        model.addAttribute("userName", userName);
        return "rslt.html";
    }
}
