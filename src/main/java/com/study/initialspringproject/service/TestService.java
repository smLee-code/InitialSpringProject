package com.study.initialspringproject.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String testMethod(String input) {
        return "test" + input;
    }
}
