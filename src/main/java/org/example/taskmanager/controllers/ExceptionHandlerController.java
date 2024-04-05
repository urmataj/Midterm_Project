package org.example.taskmanager.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandlerController {

    /**
     * Handles NotFoundException and returns a ResponseEntity with a 404 status code
     * and the exception message as the response body.
     *
     * @param exception The NotFoundException to handle
     * @return ResponseEntity with a 404 status code and the exception message
     */
    public ResponseEntity<Object> handleNotFoundException(NotFoundException exception) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(exception.getMessage());
    }
    //
}
