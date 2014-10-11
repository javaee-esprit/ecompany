/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.ecompany.persistence.dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karim
 */
public class DataSource {
    
    

    private String url = "jdbc:mysql://localhost:3306/ecompanydb";
    private String user = "root";
    private String password = "root";
    private Connection connection = null;

    public Connection getConnection() {
        return connection;
    }

    
    
    private static DataSource instance;
    
    private DataSource() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("CONNECTION ESTABLISHED");
        } catch (SQLException ex) {
            Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static DataSource getInstance() {
        if(instance == null){
            instance = new DataSource();
        }
        return instance;
    }
    
    
    
    
}
