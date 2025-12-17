/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isratbd.problemsolving;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MaxMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers separated by commas: ");
        String input = scanner.nextLine();

        
        String[] numbers = input.split(",");

        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        
        for (String number : numbers) {
            int num = Integer.parseInt(number.trim()); 

            
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Lowest number: " + min);
        System.out.println("Highest number: " + max);

        scanner.close();
    }
}
