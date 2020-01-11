/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.hibernate.service;

/**
 *
 * @author dirac
 */
import com.hibernate.*;
import com.hibernate.model.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateService {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trx = session.getTransaction();
        try {
            trx.begin();
            Address address = new Address("Abou bakr", "Cairo", "Egypt");
            Address billing = new Address("Omar street", "Manoufia", "Egypt");
            Guide guide = new Guide(0, "Manager");
            Person person = new Person(0, "Mohamed", address,billing,guide);
            session.save(guide);
            session.save(person);
            trx.commit();
            
        } catch (Exception e) {
            if(trx !=null){
                trx.rollback();
                e.printStackTrace();
            }
        }finally{
            if (session != null){
                session.close();
            }
            System.exit(0);
        }
    }
    
    public void empTest(){
      /*  Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction txn = session.getTransaction();
        try { 
        txn.begin();
        Department department = new Department(0, "IT", "Information Tech");
        Department department2 = new Department(0, "CS", "Computer Science");
        Employee employee1 = new Employee(0, "Mohamed", "Cairo",department);
        Employee employee2 = new Employee(0, "Ahmed", "Giza",department);
        department.getEmployees().add(employee1);
        department.getEmployees().add(employee2);
        session.persist(department);
        session.persist(department2);
        session.persist(employee1);
        session.persist(employee2);
        txn.commit();
        System.exit(0);
        } catch(Exception e) { if(txn != null) { txn.rollback(); }
        e.printStackTrace();
        } finally {
            if(session != null) { session.close(); }
        }*/
    }
}
