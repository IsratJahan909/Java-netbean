

package com.abc.crud2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CRUD2 {

    
       private static final String DB_URL = "jdbc:mysql://localhost:3307/abc";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        String insertSQL = "INSERT INTO users (name, email) VALUES (? , ?)";
        String selectSQL = "SELECT * FROM users";

        //Simple Data insertion
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            System.out.println("Connected to the database");
            

            //Insert sample data
            PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
          
            insertStmt.setString(1,"John");
            insertStmt.setString(2,"John@gmail.com");
            
            
            //inser into users (name, email)
            insertStmt.executeUpdate();
            System.out.println("Inserted record successfully.");
            
            
            //Fetch and display data
            PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
            ResultSet rs = selectStmt.executeQuery();
            
            while(rs.next()) {
                int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }
    }

