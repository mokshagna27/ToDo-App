package com.mokshagna.app.repository;

import com.mokshagna.app.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task,Long>{
}
