package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here
        int a[] = {10, 5, 2, 4, 11, 6, 8};
        selection_sort(a);
        print(a);
    }

    public static void print(int a[]) {
        print(a, 0);
    }

    private static void print(int a[], int i) {
        if (i == a.length) return;
        System.out.println(a[i] + "");
        print(a, i + 1);
    }

    public static void selection_sort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = a[i];
            int kmin = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    kmin = j;
                }
            }
            // swap a[i], a[kmin]
            swap(a, i, kmin);
        }
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
