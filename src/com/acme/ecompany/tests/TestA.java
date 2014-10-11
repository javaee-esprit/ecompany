/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.ecompany.tests;

import com.acme.ecompany.persistence.dao.DataSource;

/**
 *
 * @author Karim
 */
public class TestA {
    
    public static void main(String[] args) {
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        A a3 = A.getInstance();
        DataSource.getInstance();
        
    }
    
}
