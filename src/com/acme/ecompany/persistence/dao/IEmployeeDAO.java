/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.ecompany.persistence.dao;

import com.acme.ecompany.persistence.model.Employee;
import java.util.List;

/**
 *
 * @author Karim
 */
public interface IEmployeeDAO {
   
    void save(Employee employee);
    Employee findById(int id);
    void update(Employee employee);
    void delete(Employee employee);
    List<Employee> findAll();
    
            
    
}
