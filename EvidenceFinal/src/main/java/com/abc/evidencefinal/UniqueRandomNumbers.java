
package com.abc.evidencefinal;

import java.util.LinkedHashSet;
import java.util.Set;


public class UniqueRandomNumbers {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
//        Random rand = new Random();

        while (numbers.size() < 10) {
            numbers.add((int) (Math.random() * 100));
        }

        System.out.println("10 Unique Random Numbers: " + numbers);
    }
}
