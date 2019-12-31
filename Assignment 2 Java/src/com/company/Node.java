package com.company;

public class Node {
    String data;
    Node next;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(String a) {
        this.data = a;
        next = null;
    }

}
