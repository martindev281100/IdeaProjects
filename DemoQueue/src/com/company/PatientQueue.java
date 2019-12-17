package com.company;

public class PatientQueue {
    private Patient[] patients;
    private int front;
    private int rear;

    private final int SIZE = 50;

    public PatientQueue() {
        patients = new Patient[SIZE];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void enqueue(Patient p) {
        if (front == -1) {
            front = rear = 0;
            patients[front] = p;
        } else if (rear == SIZE - 1) {
            throw new QueueOverflowException("Queue is empty!");
        } else {
            patients[++rear] = p;
        }
    }

    public Patient dequeue() {
        if (this.isEmpty()) throw new QueueEmptyException("Queue is empty!");
        Patient p = patients[front++];
        return p;
    }

    public void clear() {
        front = 0;
        rear = -1;
    }

}
