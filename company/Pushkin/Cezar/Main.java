package com.company.Pushkin.Cezar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = "MVEZ MZUZ MZTZ";
        int key = 17;
        Decrypt(l, key);
        System.out.print("Результат - > " + key);
    }

    public static void Decrypt(String str, int n) {

        int k = Integer.parseInt("-" + n);

        String string = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c += k % 26;
                if (c < 'a')
                    c += 26;
                if (c > 'z')
                    c -= 26;
            } else if (c >= 'A' && c <= 'Z') {
                if (c < 'A')
                    c += 26;
                if (c > 'Z')
                    c -= 26;
            }
            string += c;
        }
        System.out.println("Код : " + string);
    }


}
