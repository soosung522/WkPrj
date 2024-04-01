package org.example;

import java.util.Scanner;

public class Code05_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));

        System.out.printf("정수입력 ==> ");
        int score = s.nextInt();

        if (score >= 90) {
            System.out.printf("A");
        } else {
        if (score <= 80) {
            System.out.printf("B");
        } else {
            if (score<=70) {
                System.out.printf("C");
            } else {
                if (score >+60) {
                    System.out.printf("0");
                } else {
                    System.out.printf("f");
                }
            }
        }
        }
    }
