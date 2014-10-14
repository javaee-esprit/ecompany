/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.ecompany.persistence.dao;

import com.acme.ecompany.persistence.model.Employee;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karim
 */
public class EmployeeDAO implements IEmployeeDAO{
    
    private Connection connection = DataSource.getInstance().getConnection();
    
    private static final String SQL_FIND =  "SELECT * FROM T_EMPLOYEE WHERE ID=?";
    private static final String SQL_SAVE =  "INSERT INTO T_EMPLOYEE (ID,NAME,SALARY) VALUES (?,?,?)";

    @Override
    public void save(Employee employee) {
        if(findById(employee.getId())== null){
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(SQL_SAVE);
                pstmt.setInt(1, employee.getId());
                pstmt.setString(2, employee.getName());
                pstmt.setDouble(3, employee.getSalary());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, "save failed", ex);
            }
        }
    }

    @Override
    public Employee findById(int id) {
        Employee found = null;
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;       
        
        try{
            
            pstmt = connection.prepareStatement(SQL_FIND);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                int employeeId = rs.getInt("ID");
                String employeeName = rs.getString("NAME");
                double employeeSalary = rs.getDouble("SALARY");
                found = new Employee(employeeId,employeeName,employeeSalary);          
            }

                
        }catch(SQLException  ex){
           Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, "find failed", ex);
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
