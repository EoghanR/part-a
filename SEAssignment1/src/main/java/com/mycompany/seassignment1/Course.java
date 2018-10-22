/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seassignment1;

import org.joda.time.DateTime;
import java.util.ArrayList;
/**
 *
 * @author Eoghan
 */
public class Course {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate;
    private DateTime endDate;
    
    public Course(String n, DateTime sd, DateTime ed){
        this.name = n;
        this.startDate = sd;
        this.endDate = ed;
    }
    
    public void addModule(Module m){
        this.modules.add(m);
        m.addCourse(this);
    }
    
    public void addStudent(Student s){
        this.students.add(s);
        s.setCourse(this);
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
