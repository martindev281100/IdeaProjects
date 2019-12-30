package com.company;

import javax.print.attribute.standard.Finishings;
import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.logging.Logger;


public class Demo {
    Stack<Integer> ReceivingStack = new Stack<Integer>();
    Queue<Integer> SendingQueue = new LinkedList<>();

    public void Menu() {
        Scanner sc = new Scanner(System.in);
        int Choice;
        System.out.println("-------------Menu-------------");
        System.out.println("1. Send messages");
        System.out.println("2. Receive messages");
        System.out.println("0. Exit");
        System.out.println("Your selection: ");
        Choice = sc.nextInt();
        while (Choice != 0) {
            switch (Choice) {
                case 1:
                    Send();
                    break;
                case 2:
                    Receive();
                    break;
                case 0:
                    System.exit(0);
            }
        }

        private void Receive() {
            System.out.println("hello");
        }

        private void Send() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Sending ... ");
            String message;
            do {
                message = sc.nextLine();
                if (message != "Finish") {
                    SendingQueue.enQueue(message);
                }
            }
            while(message != "Finish");
            while(SendingQueue.isEmpty())
            {
                try{
                    String a = SendingQueue.deQueue();
                    processStack.push(a);
                    System.out.println("Messages: "+a+"is sending");
                }
                catch (Exception ex)
                {
                    Logger.getLogger()
                }
            }

        }


    }
}