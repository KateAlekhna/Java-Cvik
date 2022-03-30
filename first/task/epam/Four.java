package com.first.task.epam;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите х = ");
        x = in.nextInt();
        System.out.print("Введите y = ");
        y = in.nextInt();

        if (x >= -4 && x <= 4 && y >=-3 && y <= 4)
            System.out.println("T");
        else
            System.out.println("F");
    }
}
