package com.company;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = in.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }

    public static int sumDigits(long m) {
        int result = 0;

        while (m > 0) {
            result += m % 10;
            m /= 10;
        }
        return result;
    }
}
