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
public class TestSaveEmployee {

    public static void main(String[] args) {        
        Employee e = new Employee(3, "amir", 2500);
        IEmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.save(e);
        
        
    }
}
