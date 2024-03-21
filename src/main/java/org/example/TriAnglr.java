package org.example;

public class TriAnglr {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i >= j) {
                    System.out.println("*");
                } else {
                    System.out.println("");
                }
            }
            System.out.println("");
        }
        for (int i = 3; i > 0; i--) {
            for (int j = 3; j > 0; j--) {
                if (i >= j) {
                    System.out.println("*");
                } else {

                    System.out.println("");
                }
            }
            System.out.println("");
        }
    }
}
