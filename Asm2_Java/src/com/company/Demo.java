package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    MessagesQueue queue = new MessagesQueue(5);
    MessagesStack stack = new MessagesStack(200);

    public void Selection() {
        Scanner sc = new Scanner(System.in);
        String Selection = "";
        while (true) {
            System.out.println("------Messages menu");
            System.out.println("1.Type and send messages");
            System.out.println("2.View messages");
            System.out.println("3.Check contain messages");
            System.out.println("0.Exit");
            System.out.println("Choose an option:");
            Selection = sc.nextLine();
            switch (Selection) {
                case "1":
                    send_messages();
                    break;
                case "2":
                    view_messages();
                    break;
                case "3":
                    check_contain();
                    break;
                case "0":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Wrong number!");
            }
        }
    }

    private void check_contain() {
        System.out.println("Type checking message:");
        Scanner sc = new Scanner(System.in);
        String mess;
        mess = sc.nextLine();
        if (stack.check(mess)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private void view_messages() {
        if (stack.isEmpty()) {
            System.out.println("No incoming message !");
        } else {
            while (!stack.isEmpty()) {
                try {
                    System.out.println("Message: " + stack.pop());
                    System.out.println("Size: "+stack.size());
                } catch (StackEmptyException ex) {
                    System.out.println("Out of mem");
                }
            }
        }
    }

    private void send_messages() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text messages: ");
        String mess;
        do {
            mess= sc.nextLine();
            if (!mess.equals("ok")) {
                queue.add(mess);
            }
        } while (!mess.equals("ok"));
        while (!queue.isEmpty()) {
            try {
                String a = queue.remove();
                stack.push(a);
            } catch (OutOfMemoryError error) {
                System.out.println("Queue memory is full!");
            }
        }
    }
}

