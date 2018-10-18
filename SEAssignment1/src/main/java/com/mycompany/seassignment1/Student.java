package com.mycompany.seassignment1;

import java.util.ArrayList;
import java.util.Collection;
import org.joda.time.DateTime;
/**
 *
 * @author Eoghan
 */
public class Student {
    
    private String name;
    private int age;
    private DateTime DOB;
    private int ID;
    private String username;
    private Course course;
    private ArrayList<Module> modules;
    
    public Student(String n, int a, DateTime dob, int id){
        this.name = n;
        this.age = a;
        this.DOB = dob;
        this.ID = id;
    }
    
    public String getUsername(){
        String un = this.name + this.age;
        return un;
    }
    
    public void addModule(Module m){
        this.modules.add(m);
    }
    
    public void addModule(Collection<Module> m){
        this.modules.addAll(m);
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
