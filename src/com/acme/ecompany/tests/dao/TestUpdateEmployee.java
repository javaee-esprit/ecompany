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
public class TestUpdateEmployee {
    
    public static void main(String[] args) {
        IEmployeeDAO employeeDAO = new EmployeeDAO();
        Employee amir = employeeDAO.findById(3);
        amir.setSalary(80000);
        employeeDAO.update(amir);
    }
    
}
