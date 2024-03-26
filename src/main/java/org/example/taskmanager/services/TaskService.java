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

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        Optional<Task> taskOptional = taskRepository.findById(id);
        if (taskOptional.isPresent()) {
            return taskOptional.get();
        } else {
            throw new RuntimeException("User not found with id " + id);
        }
    }

    public Task createTask(TaskDTO taskDTO) {
        Task task = taskMapper.toEntity(taskDTO);
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, TaskDTO updatedTask) {
        Task task = getTaskById(id);
        task.setTitle(updatedTask.getTitle());
        task.setDescription(updatedTask.getDescription());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        Task task = getTaskById(id);
        taskRepository.delete(task);
    }
    //
}
