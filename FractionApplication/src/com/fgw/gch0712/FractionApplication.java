package com.fgw.gch0712;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Program to demo how fractions work.
 *
 * @author tungdt27
 */
public class FractionApplication {

    private static final int EXIT = 0;
    private static final int ADD = 1;
    private static final int SUBTRACT = 2;
    private static final int MULTIPLY = 3;
    private static final int DIVIDE = 4;
    private static final int SIMPLIFY = 5;
    private static final int MIN = 6;
    private static final int MAX = 7;

    private String menu;

    public FractionApplication(String menu) {
        this.menu = menu;
    }

    private void printMenu() {
        System.out.println(menu);
    }

    public void run() {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = getChoice();
            doTask(choice);
            if (choice == EXIT) {
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu = "Fraction menu: \n";
        menu += " 1. Add\n";
        menu += " 2. Subtract\n";
        menu += " 3. Multiply\n";
        menu += " 4. Divide\n";
        menu += " 5. Simplify\n";
        menu += " 6. Min\n";
        menu += " 7. Max\n";
        menu += " 0. Exit\n";

        FractionApplication program = new FractionApplication(menu);
        program.run();
    }

    private int getChoice() {
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        return choice;
    }

    private void doTask(int choice) {
        switch (choice) {
            case EXIT:
                System.out.println("See you later");
                break;
            case ADD:
                doTaskAdd();
                break;
            case SUBTRACT:
                doTaskSubtract();
                break;
            // HOMEWORK: do other cases
            case DIVIDE:
                doTaskDivide();
                break;
            case MIN:
                doTaskMin();
                break;
            default:
                System.out.println("Invalid option!");
        }
    }

    private void doTaskAdd() {

        Fraction f1 = enterFraction();
        Fraction f2 = enterFraction();

        System.out.println("Sum of 2 fractions:");

        Fraction sum;
        try {
            sum = f1.add(f2);
            System.out.println(f1 + " + " + f2 + " = " + sum);
        } catch (FractionException ex) {
            System.out.println(ex.getMessage());
        }

        
    }

    private Fraction enterFraction() {
        Fraction f;

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter fraction numerator: ");
                int a = sc.nextInt();

                System.out.print("Enter fraction denominator: ");
                int b = sc.nextInt();

                f = new Fraction(a, b);

                break;
            } catch (FractionException ae) {
                System.out.println(ae.getMessage() + ". Try again!");
            } catch (InputMismatchException ie) {
                System.out.println("Invalid number! Try again");
            }
        }
        return f;
    }

    private void doTaskSubtract() {
        System.out.println("Not implemented yet!");
    }

    private void doTaskMin() {
        

        Fraction f1 = enterFraction();
        Fraction f2 = enterFraction();

        Fraction fmin = Fraction.min(f1, f2);

        System.out.println("Min (" + f1 + ", " + f2 + ") = " + fmin);

    }

    private void doTaskDivide() {

        Fraction f1 = enterFraction();
        try {
            Fraction f2 = enterFraction();

            System.out.println(f1 + " : " + f2 + " = " + f1.divide(f2));
        }
        catch (FractionException ae) {
            System.out.println("Cannot divide fraction zero!");
        }
    }

}
