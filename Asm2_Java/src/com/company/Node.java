package com.company;

public class Node {
    private int info;
    private Node next;

    public Node(int info) {
        this.info = info;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getInfo() {
        return info;
    }
}
