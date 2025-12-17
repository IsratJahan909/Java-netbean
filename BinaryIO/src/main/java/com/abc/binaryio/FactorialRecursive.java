/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.binaryio;

import java.util.Scanner;

/**
 *
 * @author B11
 */
public class FactorialRecursive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n = sc.nextInt();
        long result = factorialRecursive(n); 
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorisal is not defined for nrgative numbers");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}
