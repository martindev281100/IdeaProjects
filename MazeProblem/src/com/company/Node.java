package com.company;

public class Node {
    Cell data;
    Node next;

    public Node(Cell data) {
        this.data = data;
        this.next = null;
    }


    public Cell getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Cell data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
