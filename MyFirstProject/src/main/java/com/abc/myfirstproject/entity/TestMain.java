/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.entity;

/**
 *
 * @author B11
 */
public class TestMain {
    public static void main (String[] args) {
        Dog d1 = new Dog();
        d1.Sound();
        d1.canEat();
        System.out.println(d1.name);
        
        
        Animal ani = new Animal();
        ani.sound();
        ani.canEat();
        System.out.println(ani.name);
        
        Tiger t1 = new Tiger ();
        System.out.println(ani.name);
        
    }
}
