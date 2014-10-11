/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.ecompany.persistence.dao;

import com.acme.ecompany.persistence.model.Employee;
import java.sql.*;
import java.util.List;

/**
 *
 * @author Karim
 */
public class EmployeeDAO implements IEmployeeDAO{
    
    private Connection connection = DataSource.getInstance().getConnection();

    @Override
    public void save(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee findById(int id) {
        Employee found = null;
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;       
        String sql = "SELECT * FROM T_EMPLOYEE WHERE ID=?";
        try{
            
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                int employeeId = rs.getInt("ID");
                String employeeName = rs.getString("NAME");
                double employeeSalary = rs.getDouble("SALARY");
                found = new Employee(employeeId,employeeName,employeeSalary);          
            }

                
        }catch(SQLException  ex){
            System.out.println("PROBLEM OCCURED : " + ex.getMessage());
        }
        return found;
    }

    @Override
    public void update(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
