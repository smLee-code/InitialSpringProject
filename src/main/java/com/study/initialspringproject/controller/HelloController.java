package com.study.initialspringproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController
{
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("data", "Hello!!");  // attributeValue는 hello.html의 data로 전송됨
        return "hello";     // src/main/resources/templates 폴더의 hello.html 파일을 가리킴 (자동으로 .html을 붙여줌)
    }

    @GetMapping("/hello-mvc")
    public String helloMvc(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody  // html의 <body> 안에 이 데이터를 직접 넣겠다는 의미
    public String helloString(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
