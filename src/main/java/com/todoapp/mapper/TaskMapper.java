package com.todoapp.mapper;

import com.todoapp.entity.Task;
import com.todoapp.dto.TaskDTO;

/**
 * Classe utilitaire permettant de convertir Entity ↔ DTO
 */
public class TaskMapper {

    public static TaskDTO toDTO(Task task){

        TaskDTO dto=new TaskDTO();

        dto.setId(task.getId());
        dto.setTitle(task.getTitle());
        dto.setDescription(task.getDescription());
        dto.setStatus(task.getStatus());

        return dto;
    }

    public static Task toEntity(TaskDTO dto){

        Task task=new Task();

        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setStatus(dto.getStatus());

        return task;
    }
}