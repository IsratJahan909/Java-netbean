
package com.abc.advancemid;

import java.util.Map;
import java.util.TreeMap;


public class MapSorting {
    public static void main(String[] args) {
    
        Map<Integer, String> studentMap = new TreeMap<>();

        studentMap.put(103, "Rakib");
        studentMap.put(101, "Anika");
        studentMap.put(105, "Jamal");
        studentMap.put(102, "Borna");

        System.out.println("Sorted Students by ID (using Map):");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }
    }
}
