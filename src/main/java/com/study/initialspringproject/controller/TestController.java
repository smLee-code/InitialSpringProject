package com.study.initialspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/hello")
    public String test() {
        return "Hello World";
    }

    @GetMapping("/parameter")
    public String getTestParameter(@RequestParam String name) {
        return name;
    }
}
