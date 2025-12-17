/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abc.myfirstproject;

/**
 *
 * @author B11
 */
public class MyFirstProject {

    public static void main(String[] args) {
        //array of object

        Student st1 = new Student(1, "Khalid", 30);
        
        Student [] stu = new Student[10];
        stu [0] = new Student(1, "Monammad", 30);
        stu [1] = new Student(2, "Jon", 20);
        stu [2] = new Student(3, "Doe", 40);
        stu [3] = new Student(4, "Jidam", 50);
        stu [4] = new Student(5, "Jamal", 45);
        stu  [5] = new Student(6, "Joli", 35);
        stu  [6] = new Student(7, "Abu Jafar", 26);
        stu  [7] = new Student(8, "Khall", 32);
        stu  [8] = new Student(9, "Rafiq", 28);
        stu  [9] = st1;
        
        System.out.println(stu[0].getall());
        
        
        st1.setName("Mahamud");
        
        
        System.out.println(st1.getName());
        System.out.println(st1.getAge());
        
        
        for 
           (int i = 0; i < stu.length; i++){
       System.out.println(stu[i]);          
               
        }
        
        Dog d = new Dog("Kaltu", "Dhaka");
        printDog(d.name);
        
        
    }
    
   
   
    public static void printDog(String name){
        System.out.println("Dog name: " + name);
    }
    
    public static void printDog(Dog anything){
        System.out.println("Dog name: " + anything.name + ", ");
    } 
    
    
  
}
