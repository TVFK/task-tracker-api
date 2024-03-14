package com.taf.tasktrackerapi.store.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "task")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Task {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "task_state_id", referencedColumnName = "id")
    private TaskState taskState;
}
