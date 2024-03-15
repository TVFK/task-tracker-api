package com.taf.tasktrackerapi.services;

import com.taf.tasktrackerapi.api.exceptions.BadRequestException;
import com.taf.tasktrackerapi.store.entities.Project;
import com.taf.tasktrackerapi.store.repositories.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> findAll(){
        return projectRepository.findAll();
    }

    public Project findOne(Long id){
        return projectRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Project project){
        projectRepository.findByName(project.getName()).ifPresent(project1 -> {
                throw new BadRequestException("project already exists");
        });

    }

    @Transactional
    public void update(Long id, Project updatedProject){
        updatedProject.setId(id);
        projectRepository.save(updatedProject);
    }

    @Transactional
    public void delete(Long id){
        projectRepository.deleteById(id);
    }
}
