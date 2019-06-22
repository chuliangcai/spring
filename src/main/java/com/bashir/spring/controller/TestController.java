package com.bashir.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class TestController {

    @RequestMapping("/query")
    public String home() {
        return "hello world";
    }
}
