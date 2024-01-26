package com.xworkz.repository;

import com.xworkz.entity.FertilizerEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class FertilizerRepoImpl implements FertilizerRepo {

   private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");

    @Override
    public Integer save(FertilizerEntity fertilizerEntity) {
        System.out.println("Running Save method in fertilizerRepoImpl : Entity is: "+fertilizerEntity);
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        System.out.println("getting transcation...");
        try {
            entityTransaction.begin();
            System.out.println("transcation start");
            entityManager.persist(fertilizerEntity);
            System.out.println("persiste..");
            entityTransaction.commit();
            System.out.println("commit the transcation");
            return fertilizerEntity.getId();

        }catch (PersistenceException persistenceException){
            System.out.println("PersistenceException in save method is :"+persistenceException.getMessage());
            entityTransaction.getRollbackOnly();
        }finally {
            System.out.println("execute finally block ");
            entityManager.close();

        }
        return null;
    }

    @Override
    public void saveAll(List<FertilizerEntity> list) {
        System.out.println("Running saveAll Method : "+list);
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        try {
            entityTransaction.begin();
            System.out.println("transcation begin");
            list.forEach(e-> entityManager.persist(e));
            entityTransaction.commit();
            System.out.println("transcation commit");

        } catch (PersistenceException pe){
            System.out.println("PersistenceException in saveAll :"+pe.getMessage());
            entityTransaction.rollback();

        } finally {
            System.out.println("Closed resources");
            entityManager.close();
        }
    }

    @Override
    public List<FertilizerEntity> findAll(int quantity) {

        System.out.println("Running findAll by quantity : "+quantity);
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        try {
            Query query =entityManager.createNamedQuery("findAllByquantity");
            query.setParameter("qt",quantity);
            List<FertilizerEntity> entities= query.getResultList();
            System.out.println("find entities :"+entities);
            return entities;

        } catch (PersistenceException pe){
            System.out.println("PersistenceException in saveAll :"+pe.getMessage());
            entityTransaction.rollback();

        } finally {
            System.out.println("Closed resources");
            entityManager.close();
        }

        return Collections.emptyList();
    }
}
