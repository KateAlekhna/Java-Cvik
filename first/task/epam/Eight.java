package com.first.task.epam;

import java.util.Random;
import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        int[] c;
        int z;
        int k;
        int sum;

        sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите k");
        k = sc.nextInt();

        System.out.print("Введите z");
        z = sc.nextInt();

        c = new int[z];
        Random rand = new Random();

        for (int i = 0; i < c.length; i++) {
            c[i] = rand.nextInt(10);
        }

        for (int i = 0; i < c.length; i++) {
            if (c[i] % k == 0) {
                sum += c[i];
            }
        }

        System.out.println(" Сумма чисел кратных " + k + " равна " + sum);

    }
}
