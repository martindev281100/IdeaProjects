package com.company;

class SendingQueue {
    private String[] array;
    private int max, top;
    private Node head;
    private Node tail;

    public void SendingQueue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void enQueue(String message) {
        Node n = new Node(message);
        if (isEmpty()) {
            head = n;
            tail = n;
            return;
        } else {
            n.setNext(head);
            head = n;
            return;
        }
    }


    public String deQueue() {
        if (isEmpty()) throw new QueueEmptyException("Empty queue!");
        String a = head.data;
        if (head == tail) {
            head = tail = null;
            return a;
        } else {
            Node n = head;
            head = n.getNext();
            n.setNext(null);
            return a;
        }
    }
}