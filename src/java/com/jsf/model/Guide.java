/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.model;


import javax.persistence.*;

/**
 *
 * @author dirac
 */
@Entity
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    
    private String name ;
    
    public  Guide(){};

    public Guide(int id, String name) {
        this.id = id;
        this.name = name;
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
    
    
}
