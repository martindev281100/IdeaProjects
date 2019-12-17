package fpt.edu.gch0712;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a: ");
            a = sc.nextInt(); // possible throwing InputMismatchException

            System.out.print("Enter b: ");
            b = sc.nextInt(); // possible throwing InputMismatchException
            
            int c = a / b;    // possible throwing ArithmeticException
            
            System.out.println("c = " + c);
        } catch (InputMismatchException e) {
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Invalid input!");
        } catch (ArithmeticException ae) {
            System.out.println("Exception message: " + ae.getMessage());
        }
        
        a = getInteger("Enter a: ");
        b = getInteger("Enter b: ");
        int c = a + b;
        System.out.println("c = " + c);
    }
    
    public static int getInteger(String prompt) {
        
        
        boolean invalid = true;
        int a = 0;
        
        while (invalid) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(prompt);
                a = sc.nextInt();
                invalid = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input (not an integer)! Try again!");
            }
        }
        return a;
    }

}
