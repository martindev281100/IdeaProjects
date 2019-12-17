package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = {1, 4, 2, 7, 44, 53, 645, 7, 3, 21, 23, 41, 412};
        quickSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void quickSort(int a[]) {
        quickSort(a, 0, a.length - 1);
    }

    public static void quickSort(int a[], int lo, int hi) {
        if (lo < hi) {
            int pivotIndex = partition(a, lo, hi);// find pivot position
            quickSort(a, lo, pivotIndex - 1);// quick sort on left half
            quickSort(a, pivotIndex + 1, hi);// quick sort on right half
        }
    }

    public static int partition(int a[], int lo, int hi) {
        int pivot = a[lo];
        //going from lo+1 ->
        //find the 1st element that ->pivot
        int i = lo + 1;
        int j = hi;

        while (i <= j) {
            //Going from left --> right, find the 1st element that > pivot
            while (i <= hi && a[i] < pivot) {
                i++;
            }
            //going from right <-- left, find the 1st element that < pivot
            //find the 1st element that < pivot
            while (j > lo && a[j] >= pivot) {
                j--;
            }
            //swap a[i] and a[j]
            if (i < j) swap(a, i, j);
        }
        if (lo < j) swap(a, lo, j);
        return j;
    }

    // swap i, j
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
