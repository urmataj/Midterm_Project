package org.example.taskmanager.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Data Transfer Object (DTO) for representing User data.
 */
@Getter
@Setter
@Data
public class UserDTO {
    private Long id; //The unique identifier for the user.
    private String username; //The username of the user.
    private String email; //The email address of the user.
    //
}
