package com.xworkz.runner;

import com.xworkz.entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class UserRunner {

    public static void main(String[] args) {

        // Creating a LocalDate object for the date of birth
        LocalDate date=LocalDate.of(1997,05,15);

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("com.xworkz");
        System.out.println("created entityManagerFactory...");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        System.out.println("created entityManager...");
        EntityTransaction entityTransaction= entityManager.getTransaction();
        System.out.println("created entityTransaction...");
        entityTransaction.begin();
        UserEntity userEntity1=new UserEntity(1,"Irfan","Khan","irfan.xworkz@gmail.com",977238960,date);
        UserEntity userEntity2=new UserEntity(2,"Rahul","Sharma","rahul.sharma@gmail.com",805845786,LocalDate.of(1998,3,12));
        UserEntity userEntity3=new UserEntity(3,"Nadeem","Ahamed","nadeem.pasa@gmail.com",967584563,LocalDate.of(1999,9,17));
        System.out.println("userEntity 3 : "+userEntity3);
        entityManager.persist(userEntity1);
        entityManager.persist(userEntity2);
        entityManager.persist(userEntity3);
        System.out.println("persistence...");
        entityTransaction.commit();
        System.out.println("commit...");
        entityManager.close();
        entityManagerFactory.close();
        System.out.println("closed EntityManager and emf...");
    }
}
