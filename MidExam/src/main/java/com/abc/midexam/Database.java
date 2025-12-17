package com.abc.midexam;

//Singleton Pattern
public class Database {
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



