package org.example.taskmanager;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest // Indicates that the class is a Spring Boot test class
@AutoConfigureMockMvc // Automatically configure the MockMvc instance
class TaskControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc; // MockMvc instance for performing HTTP requests

    @Test
    void getAllTasks_shouldReturnAllTasks() throws Exception {
        // Perform a GET request to the "/tasks" endpoint
        mockMvc.perform(MockMvcRequestBuilders.get("/tasks"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                // Expect the response status to be OK (200)
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }
    //
}

