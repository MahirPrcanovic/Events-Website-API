package com.example.dogadjaji213.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

class LoginController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
