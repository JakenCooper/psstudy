package com.jaken.psstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/psd/welcome")
public class WelcomeController {

    @RequestMapping("")
    public String welcome(){
        return "welcome";
    }


}
