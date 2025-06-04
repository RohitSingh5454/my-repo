package com.example.OaathImplementation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secureApi")
public class UserController {

    @GetMapping("/print")
    public String welcone(){
        return "Hello java techie";
    }

}
