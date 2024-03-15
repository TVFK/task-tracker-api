package com.taf.tasktrackerapi.api.controllers;

import com.taf.tasktrackerapi.api.dto.ProjectDTO;
import com.taf.tasktrackerapi.services.ProjectService;
import com.taf.tasktrackerapi.store.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    private final ProjectService projectService;
    private final ProjectDTO projectDTO;

    @Autowired
    public ProjectController(ProjectService projectService, ProjectDTO projectDTO) {
        this.projectService = projectService;
        this.projectDTO = projectDTO;
    }

    @PostMapping("/api/projects")
    public ProjectDTO createProject(@RequestBody ProjectDTO projectDTO){
        projectService.save(new Project(projectDTO.getName()));
        return null;
    }
}
