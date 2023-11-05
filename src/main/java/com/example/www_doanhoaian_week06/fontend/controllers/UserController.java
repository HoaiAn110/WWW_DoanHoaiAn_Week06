package com.example.www_doanhoaian_week06.fontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/new")
    public String showRegisterForm(){

        return "user/register_form";
    }
}
