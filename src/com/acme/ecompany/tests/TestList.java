/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.ecompany.tests;

import com.acme.ecompany.persistence.model.Employee;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Karim
 */
public class TestList {
    
    public static void main(String[] args) {
        //Employee[] emps = new Employee[1000];
        List<Employee> list = new LinkedList<Employee>();
        Employee e1 = new Employee(99, "samir", 50);
        Employee e2 = new Employee(98, "sondes", 49);
        Employee e3 = new Employee(97, "Jack", 20);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        for(Employee e:list){
            System.out.println(e);
        }
        
    }
    
}
