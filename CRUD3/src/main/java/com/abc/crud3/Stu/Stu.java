
package com.abc.crud3.Stu;

import java.time.LocalDate;

public class Stu {
    private long id;
    private String name;
    private LocalDate dateofBirth;
    private String address;

    public Stu(long id, String name, LocalDate dateofBirth, String address) {
        this.id = id;
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.address = address;
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
        this.name = name;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Stu(long id) {
        this.id = id;
    }

    public Stu(String name) {
        this.name = name;
    }

    public Stu(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
    
    public String toString() {
    return "Student " + "id= " +"name= " + name + "address+ " + address + "dob= " + dateofBirth;
    }

  
}
