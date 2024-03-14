package com.taf.tasktrackerapi.services;

import com.taf.tasktrackerapi.store.entities.Project;
import com.taf.tasktrackerapi.store.entities.TaskState;
import com.taf.tasktrackerapi.store.repositories.TaskStateRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class TaskStateService {
    private final TaskStateRepository taskStateRepository;

    public TaskStateService(TaskStateRepository taskStateRepository) {
        this.taskStateRepository = taskStateRepository;
    }
    public List<TaskState> findAll(){
        return taskStateRepository.findAll();
    }

    public TaskState findOne(Long id){
        return taskStateRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(TaskState taskState){
        taskStateRepository.save(taskState);
    }

    @Transactional
    public void update(Long id, TaskState updatedTaskState){
        updatedTaskState.setId(id);
        taskStateRepository.save(updatedTaskState);
    }

    @Transactional
    public void delete(Long id){
        taskStateRepository.deleteById(id);
    }
}
