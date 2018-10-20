package com.xx.app;
/**
 * Shell sort
 */
public class Ex1_4 {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};

        int gap = array.length / 2 + 1;

        while (gap > 0) {
            for (int j = 0; j < array.length - gap; j++) {
                if (array[j] > array[j + gap]) {
                    int tmp = array[j];
                    array[j] = array[j + gap];
                    array[j + gap] = tmp;
                }
            }
            gap--;
        }

        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}
