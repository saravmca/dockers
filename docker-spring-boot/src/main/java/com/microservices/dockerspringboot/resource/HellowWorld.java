package com.microservices.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HellowWorld {

    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to Spring Boot from Docker";
    }
}
