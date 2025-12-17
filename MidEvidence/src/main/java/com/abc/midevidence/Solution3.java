package com.abc.midevidence;

import java.util.Scanner;

public class Solution3 {

    public static double getMax(double a, double b) {
        return a > b ? a : b;
    }

    public static double getMin(double a, double b) {
        return a < b ? a : b;
    }

    public static void getMaxMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        
        double max = getMax(getMax(a, b), c);
        double min = getMin(getMin(a, b), c);

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        scanner.close();
    }

    public static void main(String[] args) {
        getMaxMin();
    }
}
