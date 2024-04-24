package org.example;

public class pprj {
    public static void main(String[] args) {
        int i,k;
        int gop;

        for (i = 1; i <= 9; i++) {
            for(k = 2; k <= 9; k++) {
                gop = i * k;
                System.out.print(i + "*" + k + "=" + gop +" ");
            }
            System.out.println();
        }
    }
}
