package com.company;

public class SinglyList {
    private Node head;
    private Node tail;

    public SinglyList() {
        head = null;
        tail = null;
    }

    public void addFirst(int newInfo) {
        //Create a new NODE
        Node n = new Node(newInfo);
        //if Empty
        if (this.isEmpty()) {
            head = n;
            tail = n;
        } else {
            //if NOT empty
            //1. Next of n ->head
            n.setNext(head);
            //2. head->n
            head = n;
        }
    }

    private boolean isEmpty() {
        if (head == null) return true;
        else return false;
    }

    public void print() {
        if (isEmpty()) {
            // System.out.println("Empty List!");
            throw new RuntimeException("Empty list !");
        } else {
            Node n = head;
            while (n != null) {
                System.out.print("[" + n.getInfo() + "] -> "); //print info
                n = n.getNext();// move n to the next item
            }
            System.out.println("[]");
        }
    }

    public void addLast(int newInfo) {
        //0. Create a new node n
        Node n = new Node(newInfo);
        //1. if empty list
        //head, tail points to n
        if (this.isEmpty()) {
            head = tail = n;
        }

        //2. if not empty list else {
        //Next of tail points -> n
        tail.setNext(n);


        //tail points -> n
        tail = n;
    }

    public void deleteFirst() {

        //1. Empty list => throw exception
        if (this.isEmpty()) throw new

                RuntimeException("Empty list!");
        //2. 1 element
        if (this.size() == 1)

        //head = tail = null
        {
            head = tail = null;
        }
        //3. Other situations
        else {
            Node n = head;
            //head -> Next of n
            head = n.getNext();
            //next of n -> null
            n.setNext(null);
        }

    }

    public void deleteLast() {
        if (this.isEmpty()) {
            throw new RuntimeException("Empty list !");
        }
        if (this.size() == 1) {
            head = tail = null;
        }
        Node prev = head;
        while(prev.getNext()!= tail)
        {
            prev = prev.getNext();
        }
        tail = prev;
        tail.setNext(null);
    }

    private int size() {
        int count = 0;
        Node n = head;
        while (n != null) {
            count++;
            n = n.getNext();
        }
        return count;
    }
}

