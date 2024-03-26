package org.example.taskmanager.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private Long userId;
}
