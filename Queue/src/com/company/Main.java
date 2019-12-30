package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        System.out.println("Queue: " + queue);
        queue.add(2);
        System.out.println("Queue: " + queue);
        queue.add(3);
        System.out.println("Queue: " + queue);
        queue.add(4);
        System.out.println("Queue: " + queue);
        int deQueue = queue.remove();
        System.out.println("Remove element: " + deQueue);
        System.out.println("Queue: " + queue);
        System.out.println("Peek: "+ queue.peek());
    }
}
