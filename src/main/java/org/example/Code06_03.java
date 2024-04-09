package org.example;

import java.util.Scanner;

public class Code06_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;

        System.out.print("a ==> ");
        a = s.nextInt();
        System.out.print("b ==> ");
        b = s.nextInt();

        if (a < b) {
            for (a = a; a <= b; a++) {
                if (a % 3 == 0) {
                    System.out.println(a);
                }
            }
        } else if (a > b) {
            for (a = a; a >= b; a--) {
                if (a % 3 == 0) {
                    System.out.println(a);

                }
            }
        }
        s.close();
    }
}