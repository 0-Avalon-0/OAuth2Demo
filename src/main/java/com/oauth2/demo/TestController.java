package com.oauth2.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController{

    @RequestMapping(value = "/test")
    public String func(){
        return "func finished";
    }
}
