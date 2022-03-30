package com.first.task.epam;

import java.util.Scanner;

public class Ten {

    public static void main(String[] args) {

        int n;
        int[][] mas;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер n: ");
        n = in.nextInt();

        mas = new int[n][n];

        for (int i = 0; i < mas.length; i = i + 2) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = j + 1;
                mas[i + 1][j] = mas[i].length - j;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%3d ", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}