package org.example.taskmanager.mappers;

import org.example.taskmanager.dtos.UserDTO;
import org.example.taskmanager.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
//    public UserDTO toDto(User user) {
//        UserDTO userDTO = new UserDTO();
//        userDTO.setId(user.getId());
//        userDTO.setUsername(user.getUsername());
//        userDTO.setEmail(user.getEmail());
//        return userDTO;
//    }

    public User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        return user;
    }
}
