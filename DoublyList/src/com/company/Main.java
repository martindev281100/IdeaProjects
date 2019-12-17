package com.company;

public class Main {


    public static void main(String[] args) {
        DoublyList list = new DoublyList();

        list.addFirst("go go go");
        list.addFirst("sua");
        list.addFirst("Manh The Luu");
        list.addLast("@@@");
        list.addLast("123");
        list.addLast("hihi");
        list.addLast("helllll");
        list.deleteFirst();
        list.deleteLast();
        list.print();
    }
}
