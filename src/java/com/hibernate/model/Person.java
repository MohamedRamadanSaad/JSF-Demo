/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.model;

import javax.persistence.*;

/**
 *
 * @author dirac
 */
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id ;
    
    @Column(nullable = false)
    private String name ;
    @ManyToOne
    @JoinColumn(name = "guide_id")
    private Guide guide;
    //
    @Embedded
    @AttributeOverrides(
            {
                @AttributeOverride(name = "city" , column =@Column(name = "city_Address")),
                @AttributeOverride(name = "street" , column =@Column(name = "street_Address")),
                @AttributeOverride(name = "country" , column =@Column(name = "country_Address"))
            }
    )
    private Address addressLiving;
    //
      @AttributeOverrides(
            {
                @AttributeOverride(name = "city" , column =@Column(name = "city_billing")),
                @AttributeOverride(name = "street" , column =@Column(name = "street_billing")),
                @AttributeOverride(name = "country" , column =@Column(name = "country_billing"))
            }
    )
    private Address addressDeliver ;
   
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
  //
    public Address getAddress() {
        return addressLiving;
    }

    public void setAddress(Address address) {
        this.addressLiving = address;
    }
    //

    public Address getDeliveryAddress() {
        return addressDeliver;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.addressDeliver = deliveryAddress;
    }
    
    public Person(){}
    public Person(int id, String name, Address addressLiving,Address addressDeliver , Guide guide) {
        this.id = id;
        this.name = name;
        this.addressLiving = addressLiving;
        this.addressDeliver = addressDeliver;
        this.guide = guide;
    }

    
    
}
