/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.ecompany.tests;

import com.acme.ecompany.persistence.model.Employee;
import java.sql.*;

/**
 *
 * @author Karim
 */
public class TestFindEmployeeById {
    
    public static void main(String[] args){
        
        String url = "jdbc:mysql://localhost:3306/ecompanydb";
        String user = "root";
        String password = "root";
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        Employee found = null;
        String sql = "SELECT * FROM T_EMPLOYEE WHERE ID='2'";
        try{
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("CONNECTION ESTABLISHED");
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                int employeeId = rs.getInt("ID");
                String employeeName = rs.getString("NAME");
                double employeeSalary = rs.getDouble("SALARY");
                found = new Employee(employeeId,employeeName,employeeSalary);
                
                
            }
            System.out.println(found);
                
        }catch(SQLException  ex){
            System.out.println("PROBLEM OCCURED : " + ex.getMessage());
        }
        
        
    }
    
}
