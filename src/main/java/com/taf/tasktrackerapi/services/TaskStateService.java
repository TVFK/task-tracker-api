package com.taf.tasktrackerapi.services;

import com.taf.tasktrackerapi.store.repositories.TaskStateRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class TaskStateService {
    private final TaskStateRepository taskStateRepository;

    public TaskStateService(TaskStateRepository taskStateRepository) {
        this.taskStateRepository = taskStateRepository;
    }
}
