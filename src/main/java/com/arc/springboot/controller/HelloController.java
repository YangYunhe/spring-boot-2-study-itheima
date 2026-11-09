package com.arc.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // http://127.0.0.1:8080/hello
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Spring Boot";
    }

}
