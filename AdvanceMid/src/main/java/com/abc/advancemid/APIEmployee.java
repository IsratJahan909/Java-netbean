
package com.abc.advancemid;

import java.math.BigDecimal;
import java.time.LocalDate;


    


public class APIEmployee {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate dob;
    private BigDecimal salary;
    private String address;

    public APIEmployee(Long id, String name, Integer age, LocalDate dob, BigDecimal salary, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.salary = salary;
        this.address = address;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public Integer getAge() { return age; }
    public LocalDate getDob() { return dob; }
    public BigDecimal getSalary() { return salary; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + salary + " - " + address;
    }
}




