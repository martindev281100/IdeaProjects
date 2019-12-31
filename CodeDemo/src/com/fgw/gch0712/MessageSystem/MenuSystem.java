package com.fgw.gch0712.MessageSystem;

import java.util.Scanner;

public class MenuSystem {
    Queue queue = new Queue(4);
    Stack stack = new Stack(250);

    public void menu() {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        while (!"0".equals(choice)) {
            System.out.println("===== Menu of Message System =====");
            System.out.println("1. TRANSFER MESSAGES");
            System.out.println("2. PROCESS MESSAGES");
            System.out.println("0. EXIT");
            System.out.println("====== *** =====");
            System.out.println("Your Choice:... ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    transfer();
                    break;
                case "2":
                    process();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Re-enter your choice");
            }
        }
    }

    private void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Trasfer ===");
        System.out.println("Enter your messages, enter End to finish");
        String messagess;
        do {
            messagess = sc.nextLine();
            if (!messagess.equals("End")) {
                queue.enqueue(messagess);
            }
        } while (!messagess.equals("End"));

        while (!queue.isEmpty()) {
            try {
                String x = queue.dequeue();
                stack.push(x);
                System.out.println("Messages: " + x + " is transfering");
            } catch (OutOfMemoryError er) {
                System.out.println("Queue is full");
            }
        }
    }

    private void process() {
        System.out.println("=== Process ===");
        if (stack.isEmpty()) {
            System.out.println("No Message");
        } else {
            while (!stack.isEmpty()) {
                try {
                    System.out.println("Message: " + stack.pop());
                } catch (StackEmptyException er) {
                    System.out.println("Stack is empty");
                }
            }
        }
    }
}
