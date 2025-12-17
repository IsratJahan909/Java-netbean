package com.abc.hashing;

import java.util.HashMap;

public class HashingTest {

    public static void main(String[] args) {
        HashMap<Person, String> personMap = new HashMap<>();

        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);
        Person p3 = new Person("Alice", 30);

        System.out.println("P 2 hashcode: --" + p1.hashCode());

        personMap.put(p1, "Engineer");
        personMap.put(p1, "Deginner");
        personMap.put(p1, "Artitecher");
        
        for (Person person : personMap.keySet()) {
            System.out.println(person.name + " (" + person.age + "): " + personMap.get(person));
        }
        System.out.println("Are p1 and p3 euqual? " + p1.equals(p3));
         System.out.println("Are p1 and p3 euqual? " + (p1== p3));
    }
}
