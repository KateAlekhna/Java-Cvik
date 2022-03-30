package com.first.task.epam;

public class Second {

    public static void main(String[] args) {
        double a = 4;
        double b = 6;
        double c = 2;
        double x;
        double square;

        square = Math.sqrt(b * b + 4 * a * c);

        x = ((b + square) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println(" x = " + x);


    }
}