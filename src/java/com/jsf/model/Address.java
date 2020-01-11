/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.model;

import javax.persistence.Embeddable;

/**
 *
 * @author dirac
 */
@Embeddable
public class Address {
    String street;
    String city;
    String country;
    public Address(){}

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }
    
}
