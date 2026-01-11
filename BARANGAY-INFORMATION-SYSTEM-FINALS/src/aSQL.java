/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paul Daniel Reyes
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class aSQL {
    
private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String USER = "root";
    private static final String PASSWORD = "michaeltrinity619"; //PASSWORD PO DINE MAM

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Updated MySQL driver class name
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}