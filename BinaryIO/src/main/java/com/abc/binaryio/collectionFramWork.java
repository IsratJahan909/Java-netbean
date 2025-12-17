/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.binaryio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author B11
 */
public class collectionFramWork {

    public static void main(String[] args) {
//        =======1. List========
        System.out.println("==List Example (ArrayList)");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicates allowed

        System.out.println("List: " + fruits);
        fruits.remove("Apple");
        System.out.println("Elements at index 1: " + fruits.get(1));
        fruits.set(1, "Mango");
        System.out.println("Modified List: " + fruits);

//         ========2. Stack========
//10.Checking if list is empty
        System.out.println("Is empty? " + fruits.isEmpty());

// 11.Iterating using for-each loop
        System.out.print("For-each loop: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i) + " ");
        }
        System.out.println();

// 12. Iterating using iterator
        System.out.print("Iterator: ");
//boolean hasNext();
//E next();
//void remove();

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

//13.Index of element
//fruits.add.("Date");
        System.out.println("List after adding another 'Date': " + fruits);
        System.out.println("Index of 'Date' :" + fruits.indexOf("Date"));
        System.out.println("Last Index of 'Date' " + fruits.lastIndexOf("Date"));

        //14. Sublistd
        List<String> subList = fruits.subList(1, 3);
        System.out.println("Full list : " + fruits);
        System.out.println("Subfruits(1, 3):" + subList);

//15.  COverting to Array
        String[] array = fruits.toArray(new String[0]);
        System.out.println("Array:" + Arrays.toString(array));

//16.   Sorting
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

//17.           
        Collections.reverse(fruits);
        System.out.println("Reversed List: " + fruits);

//18.Shuffle
        Collections.shuffle(fruits);
        System.out.println("Shuffed Array: " + fruits);

        //19.Clearing the fruits
        fruits.clear();
        System.out.println("After clear() " + fruits);
        System.out.println("Is empty now? " + fruits.isEmpty());

//20. Adding All elements from another fruits
        ArrayList<String> newList = new ArrayList<>(Arrays.asList("Mango", "Papaya", "Xyz", "ABC"));
        fruits.addAll(newList);
        System.out.println("After addAll(): " + fruits);

//21. RetainAll
        ArrayList<String> filterList = new ArrayList<>(Arrays.asList("Papaya", "Pineapple", "Xyz", "ABC"));
        fruits.retainAll(filterList);
        System.out.println("Afer retainAll: " + fruits);

//22. RemoveAll
        fruits.removeAll(filterList);
        System.out.println("After removrAll() " + fruits);

        ////23. Clone (Shallow copy)
//ArrayList<String> clonedList = (ArrayList<String>) fruits.Clone();
//        System.out.println("Clones fruits " + clonedList);
//        fruits.remove(0);
//        System.out.println("Cloned fruits: 2 " + ClonedList);
//        
//        
////24.Ensure Capacity (optinal optional )       
// cloneList.ensureCapacity(20);
// 
// 
////25.



//================2. Stack ==================

System.out.println("===Stack Example");
        Stack<Interger> stack = new Stack<>();
//stack.push("A");
//stack.push("B");
//stack.push("C");
//        System.out.println("Stack after push: " + stack);
//        
//  
//Peek at the top
        System.out.println("Top element (peek): " + stack.peek());

//pop elements
        System.out.println("Popped element: " + stack.pop());

        ////Search (l- based from top)
//System.out.println("l-based : " + stack.lastElement );


//==Queue Example==
Queue<String> queue = new LinkedList<>();
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        System.out.println("Queue after offer: " + queue);
        
        queue.remove();
        System.out.println("Queue after remove(): " + queue);

    }
}
