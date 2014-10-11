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
public class TestFindEmployeeById {
    
    public static void main(String[] args) {
        IEmployeeDAO employeeDAO = new EmployeeDAO();
        Employee e0 = employeeDAO.findById(2);
        System.out.println(e0);
    }
    
}
