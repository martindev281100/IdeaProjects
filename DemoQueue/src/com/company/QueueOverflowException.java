package com.company;

public class QueueOverflowException extends RuntimeException {
    public QueueOverflowException(String message)
    {
        super(message);
    }
}
