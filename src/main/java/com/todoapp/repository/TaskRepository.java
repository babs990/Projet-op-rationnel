package com.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.todoapp.entity.Task;

/**
 * Repository permettant d'accéder à la base de données
 */
public interface TaskRepository extends JpaRepository<Task,Long> {

}