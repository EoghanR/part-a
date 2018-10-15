package com.mycompany.seassignment1;

import java.util.Calendar;
import java.util.ArrayList;
/**
 *
 * @author Eoghan
 */
public class Student {
    
    private String name;
    private int age;
    private String DOB;
    private int ID;
    private String username;
    private Course course;
    private ArrayList<Module> modules;
    
    public Student(String n, int a, String dob, int id){
        this.name = n;
        this.age = a;
        this.DOB = dob;
        this.ID = id;
    }
    
    public String getUsername(){
        String un = this.name + this.age;
        return un;
    }
    
}
