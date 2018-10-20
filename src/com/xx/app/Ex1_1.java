package com.xx.app;
/**
 * Quadratic equation
 */
public class Ex1_1 {
    public static void main(String[] args) {

        double a = 3;
        double b = 2.5;
        double c = -0.5;

        double x1;
        double x2;

        double d = Math.pow(b, 2) - (4*a*c);

        if (d > 0){
            x1 = ((-1)*b + Math.sqrt(d)) / (2*a);
            x2 = ((-1)*b - Math.sqrt(d)) / (2*a);

            if (Double.isNaN(x1) | Double.isInfinite(x1)) {
                System.out.println("x1=0.0");
            }
            if (Double.isNaN(x2) | Double.isInfinite(x2)) {
                System.out.println("x2=0.0");
            } else
                System.out.println("x1=" + x1 + "\nx2=" + x2);
        }

        else if (d == 0){
            x1 = ((-1)*b) / (2*a);

            if (Double.isNaN(x1) | Double.isInfinite(x1)) {
                System.out.println("x1=\nx2=");
            } else
                System.out.println("x1=" + x1 + "\nx2=" + x1);
        }

        else {
            System.out.println("x1=" + "\nx2=");
        }
    }
}
