package com.wangnz.springboot.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Controller {
    @RequestMapping(value = "/hello")
    public String index() {
        return "hello";
    }
}
