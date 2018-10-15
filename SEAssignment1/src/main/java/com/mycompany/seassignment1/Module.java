/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seassignment1;

import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author Eoghan
 */
public class Module {
    private String moduleName;
    private String moduleId;
    private ArrayList<Student> students;
    
    public Module(String mn, String mi){
        this.moduleName = mn;
        this.moduleId = mi;
    }
    
    public void addStudent(Student s){
        this.students.add(s);
    }
    
    public void addStudent(Collection<Student> s){
        this.students.addAll(s);
    }
}
