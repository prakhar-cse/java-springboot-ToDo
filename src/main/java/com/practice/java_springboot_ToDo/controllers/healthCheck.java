package com.practice.java_springboot_ToDo.controllers;

@RestController("health")
public class healthCheck {

    @GetMapping()
    public void healthCheck(){

    }

}
