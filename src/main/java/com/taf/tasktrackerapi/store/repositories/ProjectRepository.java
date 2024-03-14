package com.taf.tasktrackerapi.store.repositories;

import com.taf.tasktrackerapi.store.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
