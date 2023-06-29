package io.risf.exo1;

public class Exo1 {

    public static void main(String[] args) {
        boolean result = hasOnlyOnePositiveNumber(10, 0, -5);
        System.out.println("result = " + result);
    }

    public static boolean hasOnlyOnePositiveNumber(int a, int b, int c) {
        int positiveCount = 0;
    	if (a > 0) {
            positiveCount++;
        }

        if (b > 0) {
            positiveCount++;
        }

        if (c > 0) {
            positiveCount++;
        }

        return positiveCount == 1;
    }
    }



