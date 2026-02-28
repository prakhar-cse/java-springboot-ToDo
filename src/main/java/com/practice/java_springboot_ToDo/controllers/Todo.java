package com.practice.java_springboot_ToDo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tasks")
public class Todo {

    TaskService taskService;

    public Todo(TaskService taskService){
        this.taskService = taskService;
    }


    @GetMapping
    public ArrayList<Task> getAllTask(){
        return taskService.getAllTask();
    }
}
