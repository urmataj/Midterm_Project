package org.example.taskmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    public String getEmail() {
        return null;
    }

    public String getFullName() {
        return null;
    }

    public void setEmail(String email) {
    }

    public void setFullName(String fullName) {
    }
}
