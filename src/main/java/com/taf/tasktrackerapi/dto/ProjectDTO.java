package com.taf.tasktrackerapi.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class ProjectDTO {
    @NonNull
    private String name;
}
