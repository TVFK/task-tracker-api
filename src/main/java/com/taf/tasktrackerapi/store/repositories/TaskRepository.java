package com.taf.tasktrackerapi.store.repositories;

import com.taf.tasktrackerapi.store.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
