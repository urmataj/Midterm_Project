package org.example.taskmanager.controllers;

import org.example.taskmanager.dtos.TaskDTO;
import org.example.taskmanager.entities.Task;
import org.example.taskmanager.services.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * Get all tasks
     */
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    /**
     * Get a task by ID
     *
     * @param id The ID of the task
     * @return The task with the given ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTask(@PathVariable Long id) {
        Task task = taskService.getTaskById(id);
        if (task == null) {
            throw new NotFoundException("Task not found with id " + id);
        }
        return ResponseEntity.ok(task);
    }

    /**
     * Create a new task
     *
     * @param taskDTO The DTO containing task information
     * @return The created task
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@Valid @RequestBody TaskDTO taskDTO) {
        return taskService.createTask(taskDTO);
    }

    /**
     * Update a task by ID
     *
     * @param id      The ID of the task to update
     * @param taskDTO The DTO containing updated task information
     * @return The updated task
     */
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @Valid @RequestBody TaskDTO taskDTO) {
        return taskService.updateTask(id, taskDTO);
    }

    /**
     * Delete a task by ID
     *
     * @param id The ID of the task to delete
     */
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}