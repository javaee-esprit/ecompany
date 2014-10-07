/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.ecompany.tests;

import java.sql.*;

/**
 *
 * @author Karim
 */
public class TestCreateEmployee {
    
    public static void main(String[] args){
        
        String url = "jdbc:mysql://localhost:3306/ecompanydb";
        String user = "root";
        String password = "root";
        Connection connection = null;
        Statement stmt = null;
        String sql = "INSERT INTO T_EMPLOYEE (ID,NAME,SALARY) VALUES (1, 'Ali', 5000)";
        try{
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("CONNECTION ESTABLISHED");
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        }catch(SQLException  ex){
            System.out.println("PROBLEM OCCURED : " + ex.getMessage());
        }
        
        
    }
    
}
