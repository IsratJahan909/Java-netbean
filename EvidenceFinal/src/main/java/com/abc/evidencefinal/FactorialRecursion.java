package com.abc.evidencefinal;

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give your Number: ");
        int number = sc.nextInt();
         long result = factorial(number);
        System.out.println(number + "! = " + result);

       
    }   

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
}
