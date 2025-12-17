/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject;

/**
 *
 * @author B11
 */
public class Student {
    private long id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 5)
        { this.name = name;}
    }

    public int getAge() {        
        return age;
    }

    public void setAge(int age) {
        if (age <= 0)
        {this.age = age;}
    }
    
    public void printAll(){
        System.out.println("Id: " + id + ", Name: " + name + ", Age: " + age);
    }
    
    public String getall(){
        return "Id: " + id + ", Name: " + name + ", Age: " + age;
        
    }
    
@Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
}
