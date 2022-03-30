package com.first.task.epam;

public class Nine {
    public static void main(String[] args) {

        int[] a = {1, 6, 7, 8, 9};
        int[] b = {2, 3, 4, 5};
        int[] c = new int[a.length + b.length];
        int k = 1;
        int n = 0;

        for (int i = 0; i < c.length; i++) {
            if (i < k) {
                c[i] = a[i];
            } else if (i >= k && i < b.length + k) {
                c[i] = b[n];
                n++;
            } else if (i == b.length + k) {
                c[i] = a[k];
                k++;
            }

            System.out.print(c[i] + " ");
        }
    }
}