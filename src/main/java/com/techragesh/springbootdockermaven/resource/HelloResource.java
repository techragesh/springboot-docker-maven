package com.techragesh.springbootdockermaven.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/hello")
public class HelloResource {

    @GetMapping
    public String hello(){
        return "Welcome to Spring Boot Docker example";
    }
}
