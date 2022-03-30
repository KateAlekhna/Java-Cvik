package com.first.task.epam;

public class Main {

    public static void main(String[] args) {
        int q = 3232;

        int w;
        int e;
        int r;
        int t;

        w = q % 10;
        q = q / 10;

        e = q % 10;
        q = q / 10;

        r = q % 10;
        q = q / 10;

        t = q % 10;

        if (w + e == r + t) {
            System.out.print("T");
        } else {
            System.out.print("F");
        }
    }
}