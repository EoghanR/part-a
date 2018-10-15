/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seassignment1;

import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author Eoghan
 */
public class Course {
    private String name;
    private ArrayList<Module> modules;
    private DateTime startDate;
    private DateTime endDate;
    
    public Course(String n, DateTime sd, DateTime ed){
        this.name = n;
        this.startDate = sd;
        this.endDate = ed;
    }
    
    public void addModule(Module m){
        this.modules.add(m);
    }
    
    public void addModule(Collection<Module> m){
        this.modules.addAll(m);
    }
}
