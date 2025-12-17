
package com.abc.finalsolution;


 class Developer2 extends Employee2{
    String programmingLanguage;

    
    public Developer2(String name, double salary, String programmingLanguage) {
        super(name, salary); 
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
     super.displayDetails(); 
        System.out.println("programming Language: " + programmingLanguage);
    }
    
    

    
    
    
}
