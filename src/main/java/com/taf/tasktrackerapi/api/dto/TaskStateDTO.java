package com.taf.tasktrackerapi.api.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class TaskStateDTO {
    @NonNull
    private String name;
}
