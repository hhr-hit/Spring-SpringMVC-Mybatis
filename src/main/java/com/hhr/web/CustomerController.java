package com.hhr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @RequestMapping("/") //默认拦截空请求
    public String login() {
        //return "register";
        return "login";
        //return "guide";
        //return "main";
    }
}
