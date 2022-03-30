package com.first.task.epam;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите a = ");
        a = in.nextInt();

        System.out.print("Введите b = ");
        b = in.nextInt();

        System.out.print("Введите c = ");
        c = in.nextInt();

        if (a >= 0)
        {
            a = (int) Math.pow(a, 2);
        } else {
            a = (int) Math.pow(a, 4);
        }

        if (b >= 0)
        {
            b = (int) Math.pow(b, 2);
        } else {
            b = (int) Math.pow(b, 4);
        }

        if (c >= 0)
        {
            c = (int) Math.pow(c, 2);
        } else {
            c = (int) Math.pow(c, 4);
        }

        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "c = " + c );

    }
}