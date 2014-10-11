/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.ecompany.tests;

/**
 *
 * @author Karim
 */
public class A {
    
    private static A instance;

    public static A getInstance() {
        if(instance == null){
            instance = new A();
        }    
        return instance;
    }

    
    
    

    private A() {
    }
    
    
    
}
