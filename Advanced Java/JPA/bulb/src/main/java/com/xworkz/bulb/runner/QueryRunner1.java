package com.xworkz.bulb.runner;

import com.xworkz.bulb.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QueryRunner1 {

    public static void main(String[] args) {

       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("com.xworkz");
       EntityManager entityManager= entityManagerFactory.createEntityManager();
        Query query= entityManager.createNamedQuery("findbyShap");
        query.setParameter("sp","Round");
        Object object= query.getSingleResult();
        BulbEntity bulbEntity=(BulbEntity)object;
        System.out.println("findEntityByShap: "+bulbEntity);

    }
}
