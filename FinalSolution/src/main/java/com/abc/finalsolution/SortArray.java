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
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: row and column input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] array2d = new int[rows][cols];

        // Step 2: Input elements row by row
        System.out.println("Enter the array elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2d[i][j] = sc.nextInt();
            }
        }

        // Step 3: Call sorting method
        arraySort2d(array2d);

        sc.close();
    }

    public static void arraySort2d(int[][] Array2d) {
        System.out.println("Row-wise sorted 2D array:");
        for (int[] array : Array2d) {
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        }
        System.out.println("Full 2D array: " + Arrays.deepToString(Array2d));
    }
}
