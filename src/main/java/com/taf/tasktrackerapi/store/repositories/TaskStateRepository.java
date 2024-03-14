package com.taf.tasktrackerapi.store.repositories;

import com.taf.tasktrackerapi.store.entities.TaskState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStateRepository extends JpaRepository<TaskState, Long> {
}
