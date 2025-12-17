/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.binaryio;

import java.util.PriorityQueue;

/**
 *
 * @author B11
 */
public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
       
       pq.add(30);
       pq.add(20);
       pq.add(10);
        System.out.println("Priority Queue after add: " + pq);
        
        pq.offer(5);
        System.out.println("Priority Queue after offer(5): " + pq);
        
        System.out.println("");
       
        
    }
}
