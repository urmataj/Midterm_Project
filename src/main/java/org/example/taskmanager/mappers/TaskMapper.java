package org.example.taskmanager.mappers;

import org.example.taskmanager.dtos.TaskDTO;
import org.example.taskmanager.entities.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {
    // Converts a Task entity to a TaskDTO
    public TaskDTO toDto(Task task) {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(task.getId());
        taskDTO.setTitle(task.getTitle());
        taskDTO.setDescription(task.getDescription());
        taskDTO.setCompleted(task.isCompleted());
        taskDTO.setUserId(task.getUser().getId());

        return taskDTO;
    }
    // Converts a TaskDTO to a Task entity
    public Task toEntity(TaskDTO taskDTO) {
        Task task = new Task();
        task.setId(taskDTO.getId());
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setCompleted(taskDTO.isCompleted());

        return task;
    }
}
