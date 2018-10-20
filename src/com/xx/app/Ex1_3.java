package com.xx.app;
/**
 * Bubble sort
 */
public class Ex1_3 {
    public static void main(String[] args) {

        int[] array = {30, 2, 10, 4, 6};

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }

        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}
