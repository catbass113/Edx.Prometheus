package com.xx.app;
/**
 * Binary search
 */
public class Ex1_5 {
    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        boolean find = false;
        int begin = 0;
        int end = data.length - 1;

        while (begin <= end) {
            int mid = (begin + end) / 2;

            if (data[mid] > numberToFind) {
                end = mid - 1;
            }
            else if (data[mid] < numberToFind) {
                begin = mid + 1;
            }

            if (data[mid] == numberToFind) {
                System.out.println(mid);
                find = true;
                break;
            }
        }
        if (!find) System.out.println(-1);
    }
}
