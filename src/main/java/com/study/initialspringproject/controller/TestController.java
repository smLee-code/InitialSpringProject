package com.study.initialspringproject.controller;

import com.study.initialspringproject.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/hello")
    public String test() {
        return "Hello World";
    }

    @GetMapping("/parameter")
    public String getTestParameter(@RequestParam String name) {
        return testService.testMethod(name);
    }
}
