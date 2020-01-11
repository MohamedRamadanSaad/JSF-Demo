/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author dirac
 */
@ManagedBean(eager = true)
@SessionScoped
public class Department {
    private int id ;
    private String name;
    private String city;  
    private Map<String,String> cities = new HashMap<String, String>();
    public Department() {
    }
   @PostConstruct
    public void init() {
        //cities
        cities = new HashMap<String, String>();
        cities.put("Marketing", "Marketing");
        cities.put("Sales","Sales");
        cities.put("Customer Service","Customer Service");
    }
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

     private static final ArrayList<Department> departments
            = new ArrayList<Department>(Arrays.asList(
                    new Department(1, "Marketing"),
                    new Department(2, "Sales"),
                    new Department(3, "Customer Service")
            ));
 public ArrayList<Department> getDepartments() {
        return departments;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
     public Map<String, String> getCities() {
        return cities;
    }
}
