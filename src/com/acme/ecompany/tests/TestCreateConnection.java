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
public class TestCreateConnection {
    
    public static void main(String[] args){
        
        String url = "jdbc:mysql://localhost:3306/ecompanydb";
        String user = "root";
        String password = "root";
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("CONNECTION ESTABLISHED");
        }catch(SQLException  ex){
            System.out.println("PROBLEM OCCURED : " + ex.getMessage());
        }
        
    }
    
}
