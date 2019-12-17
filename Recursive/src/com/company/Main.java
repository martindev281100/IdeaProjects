package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
       /* for (int i = 0; i < 6; i++)
        {
            System.out.println("5^" + i + "=" + power5th(i));

        }*/
        for (int k = 0; k < 6; k++) {
            System.out.println(k + "! = " + nfact(k));
        }
       /* for (int c = 0; c < 6; c++)
        {
            System.out.println("1+2+...+"+c+ " = "+ sum(c-1));
        }*/


    }

    public static int power5th(int n) {
        if (n == 0) return 1;
        return 5 * power5th(n - 1);
    }

    public static int nfact(int n) {
        //return n!
        if (n == 0) return 1;
        return n * nfact(n - 1);
    }

    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void print(int[] a, int i) {
        if (i == a.length) return;
        System.out.println(a[i]);
        print(a, i + 1);
    }

    public static int sumArray(int[] a, int i) {
        if (i == a.length) return 0;
        return a[i] + sumArray(a, i + 1);
    }
    public static void convertBinary(int n)
    {
        int q = n/2;
        int r = n%2;
        if(q>0) convertBinary(q);
    }
}
