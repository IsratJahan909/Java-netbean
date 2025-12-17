
package com.abc.jsp_crud.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;



   public class Emp {
    private Long id;
    private String name;
    private Integer age;
    private Date dob;
    private BigDecimal salary;
    private String address;

    public Emp() {
    }

    public Emp(Long id, String name, Integer age,Date dob, BigDecimal salary, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.salary = salary;
        this.address = address;
    }

    public Emp(String name, Integer age, Date dob, BigDecimal salary, String address) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.salary = salary;
        this.address = address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Date getDob() {
        return dob;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }
    
    
    @Override
   public String toString(){
   return "Emp [id=" + id + " ,name=" + name + ",age=" + age + ", dob" + dob + ",salary" + salary + ",address" + address +"]";
   } 
    
}
 

