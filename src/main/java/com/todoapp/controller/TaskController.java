package com.todoapp.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.todoapp.dto.TaskDTO;
import com.todoapp.service.TaskService;

/**
 * Controller REST exposant les endpoints API
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service){
        this.service=service;
    }

    @PostMapping
    public TaskDTO createTask(@RequestBody TaskDTO dto){
        return service.createTask(dto);
    }

    @GetMapping
    public List<TaskDTO> getAllTasks(){
        return service.getAllTasks();
    }

    @PutMapping("/{id}")
    public TaskDTO updateTask(@PathVariable Long id,@RequestBody TaskDTO dto){
        return service.updateTask(id,dto);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        service.deleteTask(id);
    }
}