package com.company;

class SendingQueue {
    private String[] array;
    private int max, top;

    public SendingQueue(int max) {
        this.max = max;
        array = new String[max];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }

    public boolean isFull() {
        if (top == max - 1) return true;
        return false;
    }

    public void enQueue(String messages) {
        if (isFull()) {
            System.out.println("Queue is full !");
            return;
        } else {
            top = 1 + top;
            array[top] = messages;
        }
    }

    public String deQueue() {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        } else {
            String a = array[0];
            for (int i = 0; i < top; i++) {
                array[i] = array[i + 1];
            }
            top--;
            return a;
        }
    }

    public int size() {
        int s = top + 1;
        return s;
    }
}