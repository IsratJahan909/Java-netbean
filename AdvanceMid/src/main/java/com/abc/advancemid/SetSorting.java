
package com.abc.advancemid;

import java.util.Set;
import java.util.TreeSet;


public class SetSorting {
    public static void main(String[] args) {
       
        Set<String> students = new TreeSet<>();

        students.add("Rakib");
        students.add("Anika");
        students.add("Jamal");
        students.add("Borna");
        students.add("Anika"); 

        System.out.println("Sorted Students (using Set):");
        for (String s : students) {
            System.out.println(s);
        }
    }
}
