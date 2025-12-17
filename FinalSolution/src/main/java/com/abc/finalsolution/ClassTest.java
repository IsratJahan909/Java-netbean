/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.finalsolution;

import java.util.Scanner;

/**
 *
 * @author B11
 */
public class ClassTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        
        fibonacci(n);
    }
    
    // Fibonacci Number
    public static void fibonacci(int n){
    int a = 0, b = 1, c;
        System.out.print(a + "  " + b);
        for (int i = 0; i<n; i++){
            c = a + b;
            System.out.print(" " + c);
           a = b;
           b = c;
        }
        System.out.println();
    }
    
    
    //2D Array
}
