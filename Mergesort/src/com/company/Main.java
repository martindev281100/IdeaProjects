package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

    }

    public static void merge_sort(int a[]) {
        merge_sort(a, 0, a.length - 1);
    }

    private static void merge_sort(int a[], int lo, int hi) {
        //base case
        if (lo >= hi) return;
        //recursive case
        int mid = (lo + hi) / 2;
        merge_sort(a, lo, mid);
        merge_sort(a, mid + 1, hi);
        merge(a, lo, mid + 1, hi);
    }

    private static void merge(int[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid;
        int k = 0;
        int temp[] = new int[hi - lo];
        while (i < mid && j <= hi) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++]; //copy a[i] and increase i, k
            } else {
                temp[k++] = a[j++];//copy a[j] and increase i, k
            }
        }
        if (i == mid) {
            //1st part is done, there are some more in 2nd parts
            for (; j <= hi; j++) {
                temp[k++] = a[j];
            }
            //2nd part is done, there are some more in 1st parts        } else {
            for (; i < mid; i++) {
                temp[k++] = a[i];
            }
        }
        //vopy temp -> a
        for (k = 0; k < temp.length; k++) {
            a[lo + k] = temp[k];
        }
    }


}
