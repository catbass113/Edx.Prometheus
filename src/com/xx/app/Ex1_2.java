package com.xx.app;
/**
 * Matrix
 */
public class Ex1_2 {
    public static void main(String args[]){

        for (int i = 1; i <= 25; i++) {
            if (i == 1 | i == 5 | i == 7 | i == 9 | i == 13 | i == 17 | i == 19 | i == 21 | i == 25) {
                System.out.format("%2s", "*");
                System.out.print(" ");
            } else {
                System.out.format("%2d", i);
                System.out.print(" ");
            }

            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
