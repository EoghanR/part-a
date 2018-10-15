/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seassignment1;
import java.util.ArrayList;

/**
 *
 * @author Eoghan
 */
public class main {
    
    public static void main(String[] args){
    
        ArrayList<Student> ar = new ArrayList<Student>();
        Student e = new Student("Eoghan", 21, "22/06/1997", 15310661);
        Student l = new Student("Liam", 20, "01/02/1998", 15378661);
        ar.add(e);
        ar.add(l);
        for(Student s : ar){
            System.out.println(s.getUsername());
        }
        
    }
}
