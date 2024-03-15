package com.taf.tasktrackerapi.api.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class TaskStateDTO {
    @NonNull
    private String name;
}
