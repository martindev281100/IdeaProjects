package com.company;

import java.util.Arrays;

public class MessagesQueue {
    private String[] arr;
    private int front;
    private int rear;
    public int max;
    private int count;

    public MessagesQueue(int size) {
        arr = new String[size];
        max = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public String remove() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty!");
        } else {
            String element = arr[front];
            for (int i = 0; i < front; i++) {
                arr[i] = arr[i + 1];
            }
            front = (front + 1) % max;
            count--;
            return element;
        }
    }

    public boolean isEmpty() {

        return (size() == 0);
    }

    public void add(String a) {
        if (isFull()) {
            throw new RuntimeException("Queue is full !");
        }
        rear = (rear + 1) % max;
        arr[rear] = a;
        count++;
    }

    public int size() {
        return count;
    }

    private boolean isFull() {
        return (size() == max);
    }


}
