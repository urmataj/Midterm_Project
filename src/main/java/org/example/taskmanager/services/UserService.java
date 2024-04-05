package org.example.taskmanager.services;

import org.example.taskmanager.dtos.UserDTO;
import org.example.taskmanager.entities.User;
import org.example.taskmanager.mappers.UserMapper;
import org.example.taskmanager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    /**
     * Retrieves all users from the database.
     *
     * @return List of User objects
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Retrieves a user by their ID.
     *
     * @param id The ID of the user to retrieve
     * @return The User object if found
     * @throws RuntimeException if user is not found
     */
    public User getUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            return userOptional.get();
        } else {
            throw new RuntimeException("User not found with id " + id);
        }
    }

    /**
     * Creates a new user.
     *
     * @param userDTO The UserDTO object containing user information
     * @return The created User object
     */
    public User createUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        return userRepository.save(user);
    }

    /**
     * Updates an existing user.
     *
     * @param id         The ID of the user to update
     * @param updatedUser The UserDTO object containing updated user information
     * @return The updated User object
     */
    public User updateUser(Long id, UserDTO updatedUser) {
        User user = getUserById(id);
        user.setUsername(updatedUser.getUsername());
        user.setEmail(updatedUser.getEmail());
        return userRepository.save(user);
    }

    /**
     * Deletes a user by their ID.
     *
     * @param id The ID of the user to delete
     */
    public void deleteUser(Long id) {
        User user = getUserById(id);
        userRepository.delete(user);
    }
}
