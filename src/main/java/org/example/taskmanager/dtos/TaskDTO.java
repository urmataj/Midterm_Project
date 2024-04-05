package org.example.taskmanager.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TaskDTO {
    private Long id;            // Unique identifier for the task
    private String title;       // Title of the task
    private String description; // Description of the task
    private boolean completed;  // Flag indicating if the task is completed
    private Long userId;        // Foreign key referencing the user assigned to the task
}
