package com.company;

public class Main {

    public static void main(String[] args) {
        SinglyList list = new SinglyList();
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);

        list.addLast(100);
        list.addLast(101);
        list.addLast(102);

        list.deleteFirst();
        list.deleteLast();

        list.print();
    }
}
