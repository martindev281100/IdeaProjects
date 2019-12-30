package com.company;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Main {
    MyQueue transferQueue = new MyQueue();
    MyStacks processStack = new MyStacks(250);

    public void menu(){
        Scanner sc = new Scanner(System.in);
        String choice = "";
        while (!"0".equals(choice)){
            System.out.println("=====Menu of Message=====");
            System.out.println("1. Tranfer Messages");
            System.out.println("2. Process Messages");
            System.out.println("0. Exit");
            System.out.println("==========End=========");
            System.out.println("Please input your choice");
            choice = sc.nextLine();
            switch (choice) {
                case "1" : transfer(); break;
                case "2" : process(); break;
                case "0" : System.exit (0);
            }
        }
    }
    private void transfer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tranfering...");
        String message;
        do {
            message = sc.nextLine();
            if (!message.equals("Finish")){
                transferQueue.enQueue(message);
            }
        }
        while (!message.equals("Finish"));
        while (!transferQueue.isEmpty()){
            try{
                String x = transferQueue.deQueue();
                processStack.push(x);
                System.out.println("Messages: '" + x +"' is tranfering ");
            } catch
            (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void process() {
        System.out.println("Processing.....");
        while (!processStack.isEmpty()) {
            try {
                System.out.println("message "+ processStack.pop());
            } catch (Exception e) {
            }
        }
    }
    public static void main(String[] args) {
        Main dms = new Main();
        dms.menu();
    }
}
