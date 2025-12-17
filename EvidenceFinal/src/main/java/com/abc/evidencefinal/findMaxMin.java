package com.abc.evidencefinal;

import java.util.Scanner;

public class findMaxMin {
    public static void main(String[] args) {
        findMaxMin();
    }

    public static void findMaxMin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give comma seperated Numbers");
        String valuesString = sc.nextLine();
        String[] strArray = valuesString.split(",");

        int max = Integer.parseInt(strArray[0]);
        int min = Integer.parseInt(strArray[0]);

        for (String v : strArray) {
             
            int val = Integer.parseInt(v.trim());
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }
        System.out.println("Max : " + max + "Min : " + min);
    }

}
