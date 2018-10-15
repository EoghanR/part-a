package com.mycompany.seassignment1;

import java.util.Calendar;
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
    private String course;
    private String[] modules;
    
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
