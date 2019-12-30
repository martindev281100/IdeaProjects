package com.company;
import java.util.logging.Level;
import java.util.logging.Logger;

class MyQueue {
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
    public void enQueue (String x){
        Node n = new Node (x);
        if (isEmpty())
        {
            head = tail = n;
            return;
        }
        tail.next = n;
        tail = tail.next;
    }
    public String deQueue() throws Exception
    {
        if (isEmpty()) throw new Exception ("Can do dequeue from at empty Queue");
        String x = head.data;
        if(head == tail){
            head = tail = null;
            return x;
        }
        head = head.next;
        return x;
    }
}
