/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.binaryio;

/**
 *
 * @author B11
 */
public class Recursive {
    public static void main(String[] args) {
        System.out.println("First is Fibonacci number: ");
        for (int i = 0; i < 15; i++){
            System.out.print(fibbonaciRecursive(i) + " ");
        }
    }
    public static long fibbonaciRecursive(int n) {
    if (n < 0) {
     throw new IllegalArgumentException("Fibbonaci is not defined for negative number"); 
    }
    if (n == 0){
    return 0;
    }    
    if (n == 1){
    return 1;
    }
    return fibbonaciRecursive(n - 1) + fibbonaciRecursive(n - 2);
    
}
}

