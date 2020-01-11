/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.model;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author dirac
 */
@ManagedBean(name = "helloworld" , eager = true)
public class HelloManagedBean {
    public HelloManagedBean() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
      return "Hello World!";
   }
}
