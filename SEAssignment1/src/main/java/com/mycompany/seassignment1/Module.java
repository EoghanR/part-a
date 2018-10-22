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
public class Module {
    private String moduleName;
    private String moduleId;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    
    public Module(String mn, String mi){
        this.moduleName = mn;
        this.moduleId = mi;
    }
    
    public void addStudent(Student s){
        this.students.add(s);
        s.addModule(this);
    }
    
    public void addCourse(Course c){
        this.courses.add(c);
    }

    
    
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
