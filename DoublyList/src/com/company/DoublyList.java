package com.company;
import java.util.Arrays;
public class DoublyList {
    private Node head;
    private Node tail;

    public DoublyList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String data) {
        Node n = new Node(data);

        if (this.isEmpty()) {
            head = tail = n;
        } else {
            n.setNext(head);
            head.setPrev(n);
            head = n;
        }
    }

    public void deleteFirst() {
        if (this.isEmpty()) {
            throw new RuntimeException("Empty List");
        }
        if (this.size() == 1) {
            head = tail = null;
        } else {
            Node n = head;
            head = n.getNext();
            head.setPrev(null);
            n.setNext(null);
        }
    }

    public int size() {
        int count = 0;
        Node n = head;
        while (n != null) {
            count++;
            n = n.getNext();
        }
        return count;
    }

    public void print() {
        if (isEmpty()) {
            throw new RuntimeException("Empty list !");
        } else {
            Node n = head;
            while (n != null) {
                System.out.print("[" + n.getData() + "] -> ");
                n = n.getNext();
            }
            System.out.println("[]");
        }
    }

    public void addLast(String data) {
//1. Create a new node
        Node n = new Node(data);
        //2. If list is empty
        if (this.isEmpty()) {
            head = tail = n;
        }
        //3. If list is not empty
        else {
            n.setPrev(tail);
            tail.setNext(n);
            tail = n;
        }

    }

    public void deleteLast() {


        if(this.isEmpty())
        {
            throw new RuntimeException("Empty List!");
        }
        if(this.size()==1)
        {
            head = tail = null;
        }
        Node prev= head;
        while(prev.getNext()!=tail)
        {
            prev= prev.getNext();
        }
        tail = prev;
        tail.setNext(null);
    }

    //find and return node that contains data, return null if not found
    public Node find(String data) {
        throw new RuntimeException("");
    }

    //find out if list contains a node of info
    public boolean isContain(String data, String toCheckValue) {
        boolean test = false;
        String element = data;
        if (element == toCheckValue)
        {
            test = true;
        }
        System.out.println("Is "+toCheckValue+" present in the array: "+test);
        throw new UnsupportedOperationException();

    }
}
