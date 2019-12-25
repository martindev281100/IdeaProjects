package com.company;// Java code to illustrate pop()

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Creating an empty Stack
        Stack<Integer> stack = new Stack<Integer>();
        // Use add() method to add elements
        System.out.println("Push element: " + stack.push(1));
        System.out.println("Stack: " + stack);

        System.out.println("Push element: " + stack.push(2));
        System.out.println("Stack: " + stack);

        System.out.println("Push element: " + stack.push(3));
        System.out.println("Stack: " + stack);

        System.out.println("Push element: " + stack.push(4));
        // Displaying the current Stack
        System.out.println("Stack: " + stack);

        // Removing elements using pop() method
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack: " + stack);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack: " + stack);

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + stack);

        System.out.println("Peek element: " + stack.peek());
        System.out.println("Check Empty: "+ stack.isEmpty());

    }
}
