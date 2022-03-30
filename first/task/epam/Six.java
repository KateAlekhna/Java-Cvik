package com.first.task.epam;

import java.util.Scanner;

public class Six {

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

        if ( a > b && c > b ){
            System.out.println(  a + b );
        } else
            if ( a > b && b > c ) {
                System.out.println( a + c );
            }
            else
            if ( b > a && a > c ) {
                System.out.println( b + c );
            }
    }
}
