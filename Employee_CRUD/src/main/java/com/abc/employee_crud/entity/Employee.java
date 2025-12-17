
package com.abc.employee_crud.entity;

import java.time.LocalDate;
import java.util.Date;


public class Employee {
       
    private Long id;
    private String name;   
    private LocalDate dob;
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }
    private String department;

    public Employee() {
    }

    public Employee(Long id, String name, LocalDate dob, String department) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.department = department;
    }

    public Employee(String name, LocalDate dob, String department) {
        this.name = name;
        this.dob = dob;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", department=" + department + '}';
    }



   
}
