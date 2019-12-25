package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(i + "! = " + nfactorial(i));
        }
    }

    public static int nfactorial(int n) {
        //return n!
        if (n == 0) return 1; // Base case
        return n * nfactorial(n - 1);
    }
}
