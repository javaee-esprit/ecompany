/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.ecompany.tests.dao;

import com.acme.ecompany.persistence.dao.EmployeeDAO;
import com.acme.ecompany.persistence.dao.IEmployeeDAO;
import com.acme.ecompany.persistence.model.Employee;
import java.util.List;

/**
 *
 * @author Karim
 */
public class TestFindAll {
    
    public static void main(String[] args) {
        List<Employee> employees = null;
        IEmployeeDAO employeeDAO = new EmployeeDAO();
        employees = employeeDAO.findAll();
        for(Employee emp:employees){
            System.out.println(emp);
        }
    }
    
    
    
}
