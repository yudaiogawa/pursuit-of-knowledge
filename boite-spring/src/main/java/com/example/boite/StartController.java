package com.example.boite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping(value = {"/", "/index"})
    private String index() {
        return "index.html";
    }
}
