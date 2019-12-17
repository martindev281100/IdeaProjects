package com.company;

import java.util.EmptyStackException;

public class CellStack {
    private Node top;

    public CellStack() {
        top = null;
    }

    public void push(Cell c) {
        //similar to addFirst
        //Create new node
        Node n = new Node(c);

        //Next of n -> top
        n.next = top;
        //top -> n
        top = n;
    }

    public Cell pop() {
        //similar to deleteFirst but return a cell

        if (this.IsEmpty()) throw new EmptyStackException();
        Node n = top;
        top = n.next;
        n.next = null;
        return n.data;
    }


    public boolean IsEmpty() {
        return top == null;
    }
}
