package org.example.taskmanager.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception class to handle 404 Not Found errors.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    /**
     * Constructor to create a new NotFoundException with a specified message.
     *
     * @param message The error message.
     */
    public NotFoundException(String message) {
        super(message);
    }
    //
}