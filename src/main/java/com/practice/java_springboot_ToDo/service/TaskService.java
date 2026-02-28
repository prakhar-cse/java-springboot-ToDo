package com.practice.java_springboot_ToDo.service;

@Service
public class TaskService {

    ArrayList<Task> taskList = new ArrayList<>();

    private ArrayList<Task> getAllTask(){
        return taskList;
    }
}
