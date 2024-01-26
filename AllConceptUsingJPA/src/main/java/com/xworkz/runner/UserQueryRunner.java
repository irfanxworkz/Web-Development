package com.xworkz.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserQueryRunner {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        Query query1= entityManager.createNamedQuery("findFirstNameAndLastNameByEmail");
        query1.setParameter("uemail","irfan.xworkz@gmail.com");
        Object object= query1.getSingleResult();
        Object[] objects=(Object[])object;
        System.out.println("FirstName : "+objects[0]);
        System.out.println("LastName : "+objects[1]);
        System.out.println("======================================================================");
        Query query2= entityManager.createNamedQuery("findMobileAndDateOfBirthByFirstName");
        query2.setParameter("uFirstName","Irfan");
        Object object1= query2.getSingleResult();
        Object[] objects1=(Object[])object1;
        System.out.println("Mobile : "+objects1[0]);
        System.out.println("DOB : "+objects1[1]);
        entityManager.close();
        entityManagerFactory.close();
        System.out.println("closed EntityManager And EntityManagerFactory...");
    }
}
