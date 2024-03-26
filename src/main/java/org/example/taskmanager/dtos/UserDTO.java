package org.example.taskmanager.dtos;

import jakarta.validation.Valid;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.taskmanager.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@Data
public class UserDTO {
    private Long id;
    private String username;
    private String email;
}
