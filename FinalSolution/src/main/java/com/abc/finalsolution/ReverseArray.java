/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isratbd.problemsolving;

import java.util.Arrays;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 *
 * @author User
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 5, 2}; // Scanner ছাড়া fixed input
        reverseSortArray(numbers);
    }

    public static void reverseSortArray(int[] arr) {
        Arrays.sort(arr); 
        System.out.println("Reverse Sorted Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
