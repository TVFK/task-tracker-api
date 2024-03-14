package com.taf.tasktrackerapi.api.controllers;

import com.taf.tasktrackerapi.api.dto.ProjectDTO;
import com.taf.tasktrackerapi.services.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {
    private final ProjectService projectService;
    private final ProjectDTO projectDTO;

    public ProjectController(ProjectService projectService, ProjectDTO projectDTO) {
        this.projectService = projectService;
        this.projectDTO = projectDTO;
    }
}
