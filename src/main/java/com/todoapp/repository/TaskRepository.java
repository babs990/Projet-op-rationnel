package com.todoapp.repository;

import com.todoapp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository pour accéder aux données des tâches
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
}