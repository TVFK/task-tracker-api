package com.taf.tasktrackerapi.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "task_state")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskState {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nam1e", unique = true)
    private String name;

    @Column(name = "ordinal")
    private Long ordinal;

    @Column(name = "created_at")
    private Instant createdAt;

    @OneToMany(mappedBy = "taskState")
    private List<Task> tasks = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private Project project;
}
