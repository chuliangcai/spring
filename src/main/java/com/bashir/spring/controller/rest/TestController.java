package com.bashir.spring.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestController {

    @GetMapping("/query")
    public String home() {
        return "hello world";
    }

    @GetMapping("/update")
    public String update() {
        return "update success";
    }
}
