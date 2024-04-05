package org.example.taskmanager;

import org.example.taskmanager.entities.Task;
import org.example.taskmanager.repositories.TaskRepository;
import org.example.taskmanager.services.TaskService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    // Test case to verify that getAllTasks returns all tasks
    @Test
    void getAllTasks_shouldReturnAllTasks() {
        // Create a list of tasks
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task());
        tasks.add(new Task());

        // Mock the findAll method of taskRepository to return the list of tasks
        Mockito.when(taskRepository.findAll()).thenReturn(tasks);

        // Call getAllTasks method of taskService
        List<Task> result = taskService.getAllTasks();

        // Assert that the size of the result list is 2
        Assertions.assertEquals(2, result.size());
    }
}
