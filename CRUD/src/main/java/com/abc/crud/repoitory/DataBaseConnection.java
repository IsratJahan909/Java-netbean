
package com.abc.crud.repoitory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3307/test";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

   public static Connection getConnection() throws SQLException {
   try {
   Class.forName("com.mysql.cj.jdbc.Driver");
   }catch(ClassNotFoundException e) {
   e.printStackTrace();
   }
   return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
   }

}
