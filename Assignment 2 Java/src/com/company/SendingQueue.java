package com.company;

public class SendingQueue {
    private Node head;
    private Node tail;

    public void MyQueue() {
        head = tail = null;
    }

    public void clear() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void enQueue(String a) throws Exception {
        Node n = new Node(a);
        if (isEmpty()) {
            head = tail = n;
            return;
        } else {
            tail.next = n;
            tail = tail.next;
        }
        public String deQueue () throw Exception
        {
            if (isEmpty()) throw new Exception("Empty queue");
            String a = head.data;
            if (head == tail) {
                head = tail = null;
                return a;
            }
            head = head.next;
            return x;
        }
    }
}
