package com.training.exproject.clases;

import java.util.Scanner;
public class Common {
    public static String readNotEmptyString(Scanner scanner) {
        String string = "";
        while (string.length() == 0) {
            string = scanner.nextLine();
        }
        return string;
    }
}

