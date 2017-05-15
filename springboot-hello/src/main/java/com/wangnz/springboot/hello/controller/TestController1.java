package com.wangnz.springboot.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {
    @RequestMapping(value = "/")
    public String home() {
        return "hello";
    }
}
