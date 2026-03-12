package com.todoapp.service;

import com.todoapp.dto.TaskDTO;
import java.util.List;

/**
 * Interface définissant les opérations métier sur les tâches
 */
public interface TaskService {

    TaskDTO createTask(TaskDTO dto);

    List<TaskDTO> getAllTasks();

    TaskDTO updateTask(Long id, TaskDTO dto);

    void deleteTask(Long id);
}