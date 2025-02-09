package com.java.exception;

public class CustomException {
    // Define a custom checked exception
    public class InvalidAgeException extends Exception {

        // Constructor that accepts a message
        public InvalidAgeException(String message) {
            super(message);
        }

        // Constructor that accepts a message and a cause (another exception)
        public InvalidAgeException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
