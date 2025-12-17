
 
package com.abc.singletonpattern;


public class Database {
    //Singleton Pattern

  String name;
   private static Database instance;
    private Database() {
    }
    
    public static Database getInstance() {
    if (instance == null) {
    instance = new Database();
    }
    return instance;
    }
}
