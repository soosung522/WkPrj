package org.example;

import java.util.Scanner;

public class Code05_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int select;

        System.out.println("숫자입력 ==> ");
        select = s.nextInt();

        if (select % 15 == 0) {
            System.out.println("3의 배수, 5의 배수 모두 만족합니다.");
        } else if (select % 5 == 0) {
            System.out.println("5의 배수입니다");
        } else if (select % 3 == 0) {
            System.out.println("3의 배수입니다");

        }

    }
}
