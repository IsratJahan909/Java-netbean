/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.finalsolution;


class Manager2 extends Employee2 {
    int teamSize;
    

    public Manager2(int teamSize, String name, double salary) {
        super(name, salary);
        this.teamSize = teamSize;
    }
    
    @Override
    public void displayDetails() {
       super.displayDetails(); 
        System.out.println("Team Size: " + teamSize);
    }

}
    

