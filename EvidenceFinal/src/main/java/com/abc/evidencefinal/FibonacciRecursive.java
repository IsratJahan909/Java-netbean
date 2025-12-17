package com.abc.evidencefinal;

public class FibonacciRecursive {

    public static void main(String[] args) {

       int count = 10;

        System.out.println("Fibonacci seies up to " + count + "terms: ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }
    public static int fibonacciRecursive(int n) {
        if (n <= 1){
        return n;
        }
        return fibonacciRecursive (n-1) + fibonacciRecursive(n - 2);
    }
}
