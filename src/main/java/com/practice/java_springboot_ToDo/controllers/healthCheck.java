package com.practice.java_springboot_ToDo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("health")
public class healthCheck {
    @GetMapping
    public String healthCheck(){
        return "Service is healthy";
    }

}
