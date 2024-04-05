package org.example.taskmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Entity class representing a user in the Task Manager application.
 */
@Setter
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks;

    /**
            * Get the email address of the user.
     *
             * @return The email address
     */
    public String getEmail() {
        return null;
    }

    /**
     * Get the full name of the user.
     *
     * @return The full name
     */
    public String getFullName() {
        return null;
    }

    /**
     * Set the email address of the user.
     *
     * @param email The email address
     */
    public void setEmail(String email) {
    }

    /**
     * Set the full name of the user.
     *
     * @param fullName The full name
     */
    public void setFullName(String fullName) {
    }
    //
}
