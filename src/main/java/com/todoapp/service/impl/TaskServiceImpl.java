package com.todoapp.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.todoapp.repository.TaskRepository;
import com.todoapp.dto.TaskDTO;
import com.todoapp.entity.Task;
import com.todoapp.mapper.TaskMapper;
import com.todoapp.service.TaskService;
import com.todoapp.exception.ResourceNotFoundException;

/**
 * Implémentation du service métier
 */
@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository repository;

    public TaskServiceImpl(TaskRepository repository){
        this.repository=repository;
    }

    public TaskDTO createTask(TaskDTO dto){

        Task task=TaskMapper.toEntity(dto);
        task.setStatus("IN_PROGRESS");

        Task saved=repository.save(task);

        return TaskMapper.toDTO(saved);
    }

    public List<TaskDTO> getAllTasks(){

        return repository.findAll()
        .stream()
        .map(TaskMapper::toDTO)
        .collect(Collectors.toList());
    }

    public TaskDTO updateTask(Long id,TaskDTO dto){

        Task task=repository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Tache non trouvée"));

        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());

        Task updated=repository.save(task);

        return TaskMapper.toDTO(updated);
    }

    public void deleteTask(Long id){

        Task task=repository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Tache non trouvée"));

        repository.delete(task);
    }
}