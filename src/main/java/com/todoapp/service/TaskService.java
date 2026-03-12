package com.todoapp.service;

import com.todoapp.dto.TaskDTO;
import java.util.List;

public interface TaskService {

    TaskDTO createTask(TaskDTO dto);

    List<TaskDTO> getAllTasks();

    TaskDTO updateTask(Long id, TaskDTO dto);

    void deleteTask(Long id);

    TaskDTO completeTask(Long id);
}