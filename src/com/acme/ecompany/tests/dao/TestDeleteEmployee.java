/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.ecompany.tests.dao;

import com.acme.ecompany.persistence.dao.EmployeeDAO;
import com.acme.ecompany.persistence.dao.IEmployeeDAO;
import com.acme.ecompany.persistence.model.Employee;

/**
 *
 * @author Karim
 */
public class TestDeleteEmployee {
    
    public static void main(String[] args) {
        IEmployeeDAO  employeeDAO = new EmployeeDAO();
        Employee employee = new Employee();
        employee.setId(1);
        employeeDAO.delete(employee);
    }
    
}
