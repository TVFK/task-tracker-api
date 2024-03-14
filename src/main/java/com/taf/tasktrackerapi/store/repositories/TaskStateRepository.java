package com.taf.tasktrackerapi.store.repositories;

import com.taf.tasktrackerapi.store.entities.TaskState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskStateRepository extends JpaRepository<TaskState, Long> {
}
