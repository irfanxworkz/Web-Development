package com.xworkz.bulb.runner;

import com.xworkz.bulb.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BulbRunner {

    public static void main(String[] args) {

       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("com.xworkz");
        System.out.println("Creating entityManagerFActory...");
       EntityManager entityManager= entityManagerFactory.createEntityManager();
        System.out.println("Creating entityManager...");
       EntityTransaction entityTransaction= entityManager.getTransaction();
        System.out.println("Creating entityTransaction...");
        entityTransaction.begin();
        System.out.println("begin entityTransaction...");
        BulbEntity bulbEntity1= new BulbEntity(1,"Panasonic","LED","Eye-Friendly","9w/h","Round","A15","B22D","9w/h","White",240,2);
        System.out.println("bulbEntity1 :"+bulbEntity1);
        BulbEntity bulbEntity2= new BulbEntity(2,"Philips","LED","Eye-Friendly","9w/h","B22D","A18","B24D","12w/h","White",220,4);
        BulbEntity bulbEntity3= new BulbEntity(3,"Orient","LED","Eye-Friendly","3w/h","B24S","A15","B26D","8w/h","White",280,3);
        System.out.println("bulbEntity3 :"+bulbEntity3);
        BulbEntity bulbEntity4= new BulbEntity(4,"Havel","LED","Eye-Friendly","7w/h","V25R","Round","B28D","6w/h","White",260,2);

        entityManager.persist(bulbEntity1);
        System.out.println("persist...bulbEntity1");
        entityManager.persist(bulbEntity2);
        entityManager.persist(bulbEntity3);
        System.out.println("persist...bulbEntity3");
        entityManager.persist(bulbEntity4);
        entityTransaction.commit();
        System.out.println("commit");
        entityManager.close();
        System.out.println("close entityManager");
        entityManager.close();
        System.out.println("close entityManagerfactory");
        entityManagerFactory.close();
    }
}
