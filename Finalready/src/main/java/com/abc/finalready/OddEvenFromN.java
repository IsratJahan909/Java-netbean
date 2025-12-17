/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isratbd.problemsolving;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class OddEvenFromN {

    // Method to check odd/even
    public static void oddEven(int[] arr) {
        for (int val : arr) {
            if (val % 2 == 0) {
                System.out.println(val + " is Even");
            } else {
                System.out.println(val + " is Odd");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        
        oddEven(numbers);

        sc.close();
    }
}
