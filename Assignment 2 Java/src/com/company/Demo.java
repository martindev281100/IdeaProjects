package com.company;

import java.util.Scanner;
import java.util.*;


public class Demo {
    SendingQueue transferQueue = new SendingQueue();
    ReceiveStack workStack = new ReceiveStack(250);


    public void Menu() {
        Scanner sc = new Scanner(System.in);
        String Select ="";
        while (true) {
            System.out.println("-------------Menu-------------");
            System.out.println("1. Send messages");
            System.out.println("2. Receive messages");
            System.out.println("0. Exit");
            System.out.println("Your selection: ");
            Select = sc.nextLine();
                switch (Select) {
                    case "1":
                        send();
                        break;
                    case "2":
                        receive();
                        break;
                    case "0":
                        System.out.println("Closing");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong selection! Enter correct number!");
                }
            }
        }



    private void receive() {
        System.out.println("---Receive---");
        if (workStack.isEmpty()) {
            System.out.println("No incoming message!");
        } else {
            while (!workStack.isEmpty()) {
                try {
                    System.out.println("Message: " + workStack.pop());
                } catch (EmptyStackException ex) {
                    System.out.println("No incoming messages !");
                }
            }
        }
    }


    private void send() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type messages: ");
        String message;
        do {
            message = sc.nextLine();
            if (!message.equals("ok")) {
                transferQueue.enQueue(message);
            }
        } while (!message.equals("ok"));

        while (!transferQueue.isEmpty()) {
            try {
                String a = transferQueue.deQueue();
                workStack.push(a);
                System.out.println("Sending........................");
            } catch (OutOfMemoryError er) {
                System.out.println("Queue is full");
            }
        }
    }
}