package com.example.boite.interfaces.controller;

import com.example.boite.domains.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @ModelAttribute
    public UserModel setUpModel() {
        return new UserModel();
    }

    @RequestMapping({"/", "/input"})
    public String index() {
        return "index.html";
    }

    @RequestMapping("/rslt")
    public String result(@Validated UserModel userModel, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) return "index.html";

        String userName = "Alice";
        model.addAttribute("userId", userModel.getUserId());
        model.addAttribute("userName", userName);
        return "rslt.html";
    }
}
