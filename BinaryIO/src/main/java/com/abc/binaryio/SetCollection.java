package com.abc.binaryio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

    public static void main(String[] args) {

        //1. Hash
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple");// duplicate will be ignored
        hashSet.add(null);
        hashSet.add("ABC");
        System.out.println("Hashset " + hashSet);

        //2. Linkedhashset : Maintain insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Apple");// duplicate will be ignored
        linkedHashSet.add(null);
        linkedHashSet.add("ABC");
        System.out.println("linkedHashSet " + linkedHashSet);

        //3. TreeSet: Maintains Natural sorting order
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Apple");
        treeSet.add("Banana");
        System.out.println("TreeSet (Sorted Order): " + treeSet);

//Common Set Operations
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        //Union:All elements from both sets
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union " + union);

        //Intersection: Common elements
//    
//=========Map===========
//4. HashMap
//Map<String, Integer> hashMap = new HashMap<>();
//hashMap.put("Apple " , 50); 
//hashMap.put("Banana " , 50); 
//hashMap.put("Orange " , 50); 
//hashMap.put("Apple " , 55); 
//hashMap.put(null , 0);
//        System.out.println("HashMap" + hashMap);
//        System.out.println("Price of Banana: " + hashMap.get("Banana"));
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Hasan ", 11);
        hashMap.put("Kamal ", 12);
        hashMap.put("Rafiq ", 13);
        hashMap.put("Jahirul ", 14);
        hashMap.put("Hossain ", 15);
        hashMap.put(null, 16);

        System.out.println("HashMap" + hashMap);
        System.out.println("Id Of Student: " + hashMap.get("Kamal "));

        //2.LinkedHashMap: Maintains INSERTION order of keys
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Zebra", 100);
        linkedHashMap.put("Apple", 50);
        linkedHashMap.put("Banana", 30);
        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);
        
        

        //Method 1 : Using keySet()
        Set<String> hs = hashMap.keySet();
        for (String key : hs) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
        
        //Method 2 : Using entrySet() (More Efficient)
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
