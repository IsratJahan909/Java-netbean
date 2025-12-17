
package com.abc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Crud2 {
    private static final String DB_URL = "jdbc:mysql://localhost:3307/test";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    
    public static void main(String[] args) {
    String insertSQL = "Insert into users (name, email) Values(?, ?)";
    String selectSQL = "select * from users";
    
    try {
    Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    
        System.out.println("Connected to the database");
        
        PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
        
        
        insertStmt.setString(1, "john");
        insertStmt.setString(2, "john@gmail.com");
        
        insertStmt.executeUpdate();
        System.out.println("Inserted record successfully.");
        
        PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
        ResultSet rs = selectStmt.executeQuery();
        
        while (rs.next()){
        int id = rs.getInt("Id");
        String name = rs.getString("name");
        String email = rs.getString("email");
            System.out.println("Id: " + id + ", Name: " + ", Email: " + email);
        }
        
        
        
    }catch(SQLException ex){
        System.err.println("Error: " + ex.getMessage());
    }
    
    }
}
