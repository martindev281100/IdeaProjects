package com.company;

import java.util.Scanner;

public class investment {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter input investment: ");
        double investment = in.nextDouble();
        System.out.println("Enter number of rates: ");
        double rate = in.nextDouble();
        System.out.println("Enter number of years: ");
        double year = in.nextInt();

        rate *= 0.01;
    }
}
