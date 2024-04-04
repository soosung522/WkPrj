package org.example;

import java.util.Scanner;

public class Prj03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int select;

        System.out.println("숫자를 입력해 주세요 ==> ");
        select = s.nextInt();

        if (select % 21 == 0) {
            System.out.println("3과 7의 배수 모두 만족합니다.");
        } else if (select % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (select % 7 == 0) {
            System.out.println("7의 배수입니다.");
        } else {
            System.out.println("3또는 7의 배수가 아닙니다.");
        }
        s.close();
    }
}
