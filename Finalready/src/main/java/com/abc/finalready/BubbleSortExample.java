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

//1D

public class BubbleSortExample {

   
    public static void bubbleSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {             
            for (int j = 0; j < n - 1 - i; j++) {    
                if (arr[j] > arr[j + 1]) {          
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        bubbleSort(arr);

        
        System.out.println("Sorted array in ascending order:");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
