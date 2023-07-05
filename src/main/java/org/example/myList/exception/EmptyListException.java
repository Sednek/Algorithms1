package org.example.myList.exception;

public class EmptyListException extends RuntimeException {
    public EmptyListException(String message) {
        super(message);
    }
}