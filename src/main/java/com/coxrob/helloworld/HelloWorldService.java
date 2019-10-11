package com.coxrob.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {

    @RequestMapping("/hello")
    public String getGreeting() {
        return "Hello";
    }
}
