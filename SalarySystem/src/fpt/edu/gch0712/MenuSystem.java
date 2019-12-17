
package fpt.edu.gch0712;

import java.util.Scanner;

/**
 * General menu-based system class.
 * @author mac
 */
public abstract class MenuSystem {
    protected final static int EXIT = 0;
    
    protected abstract void printMenu();
    
    protected abstract void doTask(int choice);
    
    protected int getChoice() {
        System.out.print("Your choice: ");
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        
        return choice;
    }
    
    public void run() {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = getChoice();
            doTask(choice);
            if (choice == EXIT) running = false;
        }
    }
}
