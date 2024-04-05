package org.example.taskmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a task in the Task Manager application.
 */
@Setter
@Getter
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    /**
     * Represents the user assigned to the task.
     * Many tasks can be assigned to one user.
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    /**
     * Represents whether the task is completed or not.
     */
    @Setter
    @Getter
    private boolean completed;

    // Constructors, getters, and setters omitted for brevity
    //
}
