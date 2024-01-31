package com.xworkz.repo;

import com.xworkz.entity.WindowEntity;
import com.xworkz.util.EmfUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class WindowRepoImpl implements WindowRepo{

    private EntityManagerFactory entityManagerFactory= EmfUtil.getEntityManagerFactory();
    @Override
    public void save(WindowEntity entity) {
        System.out.println("Running save Method in Window Repo : "+entity);
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        try {
            entityTransaction.begin();
            System.out.println("transcation start");
            entityManager.persist(entity);
            entityTransaction.commit();
            System.out.println("saved Successfully");

        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException is : "+persistenceException.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("Closing Resources...");
        }
    }

    @Override
    public void saveAll(List<WindowEntity> entities) {
        System.out.println("Running saveall Method in Window Repo : "+entities);
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        try {
            entityTransaction.begin();
            System.out.println("transcation start");
            entities.forEach(e->entityManager.persist(e));
            entityTransaction.commit();
            System.out.println(" Successfully Saved All Entitiy");

        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException is : "+persistenceException.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("Closing Resources...");
        }
    }

    @Override
    public WindowEntity deleteMaterialByNAme(String name) {
        System.out.println("Running deleteMaterialByNAme Method in Window Repo Window Name Is: "+name);
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        try {
            entityTransaction.begin();
            System.out.println("transaction start");
            Query query=entityManager.createNamedQuery("deleteMaterialByNAme");
            query.setParameter("wName",name);
            int updatedRows= query.executeUpdate();
            entityTransaction.commit();
            System.out.println("Successfully Deleted");

        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException is : "+persistenceException.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("Closing Resources...");
        }
        return null;
    }

    @Override
    public WindowEntity updateClosedByFrame(Boolean status, String frame) {
        System.out.println("Running updateClosedByFrame Method in Window Repo Closed Status is : "+status+" and Frame color is :"+frame);
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        try {
            entityTransaction.begin();
            System.out.println("transaction start");
               Query query=entityManager.createNamedQuery("updateClosedByFrame");
               query.setParameter("wStatus",status);
               query.setParameter("wfColor",frame);
              int i= query.executeUpdate();
            entityTransaction.commit();
            System.out.println(" Successfully updated");
        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException is : "+persistenceException.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("Closing Resources...");
        }
        return null;
    }

    @Override
    public List<WindowEntity> findByFrame(String frame) {
        System.out.println("Running findByFrame method in window Repo Frame Color IS :" +frame);
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        try {
            Query query= entityManager.createNamedQuery("findByFrame");
            query.setParameter("fColor",frame);
            List<WindowEntity> entities=query.getResultList();
            entities.forEach(e-> System.out.println("Find entity Where FrameColor is "+frame+" : "+e));
            return  entities;
        }catch (PersistenceException exception){
            System.out.println("PersistenceException is : "+exception.getMessage());
        }finally {
            entityManager.close();
            System.out.println("resources Closed...");
        }
        return null;
    }

    @Override
    public List<WindowEntity> findAll() {
        System.out.println("Running findAll method in window Repo ");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        try {
            Query query= entityManager.createNamedQuery("findAll");
            List<WindowEntity> entities=query.getResultList();
            entities.forEach(e-> System.out.println("Find All Entity :"+e));
            return  entities;
        }catch (PersistenceException exception){
            System.out.println("PersistenceException is : "+exception.getMessage());
        }finally {
            entityManager.close();
            System.out.println("resources Closed...");
        }
        return null;
    }

    @Override
    public List<String> findFrameColorAllEntity() {
        System.out.println("Running findFrameColorAllEntity method in window Repo ");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        try {
            Query query= entityManager.createNamedQuery("findAllFrameColor");
            List<String> list= query.getResultList();
            list.forEach(e-> System.out.println(e));
            return list;
        }catch (PersistenceException exception){
            System.out.println("PersistenceException is : "+exception.getMessage());
        }finally {
            entityManager.close();
            System.out.println("resources Closed...");
        }
        return null;
    }
}
