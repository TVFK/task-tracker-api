package com.taf.tasktrackerapi.services;

import com.taf.tasktrackerapi.store.entities.Task;
import com.taf.tasktrackerapi.store.repositories.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll(){
        return taskRepository.findAll();
    }

    public Task findOne(Long id){
        return taskRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Task task){
        taskRepository.save(task);
    }

    @Transactional
    public void update(Long id, Task updatedTask){
        updatedTask.setId(id);
        taskRepository.save(updatedTask);
    }

    @Transactional
    public void delete(Long id){
        taskRepository.deleteById(id);
    }
}
