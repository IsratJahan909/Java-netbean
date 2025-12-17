/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isratbd.problemsolving;

import java.util.*;

/**
 *
 * @author User
 */
public class Fibonacci {
    public static void main (String[] args){
     Scanner input = new Scanner(System.in);
     
        System.out.println("Enter Your Number");
        int n = input.nextInt();
        
        Fibonacci(n);
    
    
    }
    public static void Fibonacci (int n) {
       int a = 0, b = 1, c;
        System.out.print("Fibonacci Series:" + a + " " +b);
      for (int i = 2; i < n; i++){
      c = a+b;
          System.out.print(" " + c);
          a = b;
          b = c;
      
      }  
        System.out.println();
        
    }
}
