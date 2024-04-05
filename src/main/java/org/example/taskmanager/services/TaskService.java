package org.example.taskmanager.services;

import org.example.taskmanager.dtos.TaskDTO;
import org.example.taskmanager.entities.Task;
import org.example.taskmanager.mappers.TaskMapper;
import org.example.taskmanager.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    private final TaskMapper taskMapper;

    @Autowired
    public TaskService(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    /**
     * Get all tasks.
     *
     * @return List of all tasks.
     */
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    /**
     * Get a task by ID.
     *
     * @param id The ID of the task to retrieve.
     * @return The task with the specified ID.
     * @throws RuntimeException if no task is found with the given ID.
     */
    public Task getTaskById(Long id) {
        Optional<Task> taskOptional = taskRepository.findById(id);
        if (taskOptional.isPresent()) {
            return taskOptional.get();
        } else {
            throw new RuntimeException("User not found with id " + id);
        }
    }

    /**
     * Create a new task.
     *
     * @param taskDTO The DTO containing the task information.
     * @return The created task.
     */
    public Task createTask(TaskDTO taskDTO) {
        Task task = taskMapper.toEntity(taskDTO);
        return taskRepository.save(task);
    }

    /**
     * Update an existing task.
     *
     * @param id          The ID of the task to update.
     * @param updatedTask The DTO containing the updated task information.
     * @return The updated task.
     */
    public Task updateTask(Long id, TaskDTO updatedTask) {
        Task task = getTaskById(id);
        task.setTitle(updatedTask.getTitle());
        task.setDescription(updatedTask.getDescription());
        return taskRepository.save(task);
    }

    /**
     * Delete a task.
     *
     * @param id The ID of the task to delete.
     */
    public void deleteTask(Long id) {
        Task task = getTaskById(id);
        taskRepository.delete(task);
    }
    //
}
