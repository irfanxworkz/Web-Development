package com.xworkz.repository;

import com.xworkz.entity.TempleEntity;
import com.xworkz.util.EmfUtil;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class TempleRepoImpl implements TempleRepo{

    private EntityManagerFactory entityManagerFactory= EmfUtil.getEntityManagerFactory();

    @Override
    public void save(TempleEntity entity) {
        System.out.println("Running Save in temple repo : "+entity);
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        EntityTransaction entityTransaction= entityManager.getTransaction();
        System.out.println("Associate Transaction");

        try {
            entityTransaction.begin();
            System.out.println("EntityTransaction Start");
            entityManager.persist(entity);
            entityTransaction.commit();
            System.out.println("temple entity succesfully saved");

        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: "+persistenceException.getMessage());
            entityTransaction.rollback();

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }

        //TempleRepo.super.save(entity);
    }

    @Override
    public void saveAll(List<TempleEntity> entities) {
        System.out.println("Running saveAll in temple repo : ");
        entities.forEach(e-> System.out.println("Entity : "+e));
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        EntityTransaction entityTransaction= entityManager.getTransaction();
        System.out.println("Associate Transaction");

        try {
            entityTransaction.begin();
            System.out.println("EntityTransaction Start");
            entities.forEach(et->entityManager.persist(et)); ;
            entityTransaction.commit();
            System.out.println("temple list succesfully saved");

        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: "+persistenceException.getMessage());
            entityTransaction.rollback();

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
    }

    @Override
    public List<TempleEntity> findAllByLocation(String location) {
        System.out.println("Running findAllByLocation in temple repo : "+location);
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        try {
            Query query= entityManager.createNamedQuery("findAllByLocation");
            query.setParameter("lcn",location);
            List<TempleEntity> entities= query.getResultList();
            System.out.println("Temple entity for "+location+" location is : "+entities);
            return entities;
        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: "+persistenceException.getMessage());

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return null;
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeGreaterThan(double fee) {
        System.out.println("Running findAllByEntryFeeGreaterThan in temple repo : "+fee);
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        try {
            Query query= entityManager.createNamedQuery("findAllByEntryFeeGreaterThan");
            query.setParameter("etrfee",fee);
            List<TempleEntity> entities= query.getResultList();
            entities.forEach(et-> System.out.println("Temple entity which greater than "+fee+" : "+et));
            System.out.println();
            return entities;
        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: "+persistenceException.getMessage());

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return null;
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeBetween(double startFee, double lastFee) {
        System.out.println("Running findAllByEntryFeeBetween in temple repo StartFee is :"+startFee+" And LastFee is : "+lastFee);
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        try {
            Query query= entityManager.createNamedQuery("findAllByEntryFeeBetween");
            query.setParameter("strfee",startFee);
            query.setParameter("lstfee",lastFee);
            List<TempleEntity> entities= query.getResultList();
            entities.forEach(et-> System.out.println("Temple entity which entry fee between  "+startFee+" and "+lastFee+" : "+et));
            return entities;
        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: "+persistenceException.getMessage());
        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return null;
    }

    @Override
    public List<TempleEntity> findAllByInagrudatedDateGreaterThan(LocalDate date) {
        System.out.println("Running findAllByInagrudatedDateGreaterThan in temple repo : "+date);
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        try {
            Query query= entityManager.createNamedQuery("findAllByInagrudatedDateGreaterThan");
            query.setParameter("inugrateDate",date);
            List<TempleEntity> entities= query.getResultList();
            entities.forEach(et-> System.out.println("Temple entity which greater than "+date+" : "+et));
            System.out.println();
            return entities;
        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: "+persistenceException.getMessage());

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return null;
    }

    @Override
    public List<TempleEntity> findAllByMainGodAndLocation(String mainGod, String location) {
        System.out.println("Running findAllByMainGodAndLocation in temple repo MainGod is : "+mainGod+" And location is :"+location);
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        try {
            Query query= entityManager.createNamedQuery("findAllByMainGodAndLocation");
            query.setParameter("lcn",location);
            query.setParameter("mGod",mainGod);
            List<TempleEntity> entities= query.getResultList();
            entities.forEach(et-> System.out.println("Temple entity where MainGod is:  "+ mainGod +" And Location is : "+ location + et));
            System.out.println();
            return entities;
        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: "+persistenceException.getMessage());

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return null;
    }

    @Override
    public TempleEntity findById(int id) {
        System.out.println("Running findById in temple repo : "+id);
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        try {
            Query query= entityManager.createNamedQuery("findById");
            query.setParameter("tid",id);
            Object object= query.getSingleResult();
            TempleEntity entity=(TempleEntity)object;
            System.out.println("Temple entity find by Id is :"+entity);
            return entity;
        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: "+persistenceException.getMessage());

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return null;
    }

    @Override
    public TempleEntity findByIdAndMainGod(int id, String mainGod) {
        System.out.println("Running findByIdAndMainGod in temple repo id : "+id+"and MainGod :"+mainGod);
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        try {
            Query query= entityManager.createNamedQuery("findByIdAndMainGod");
            query.setParameter("tid1",id);
            query.setParameter("mGod",mainGod);
            Object object= query.getSingleResult();
            TempleEntity entity=(TempleEntity)object;
            System.out.println("Temple entity find by IdAnd MainGod is :"+entity);
            return entity;
        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: "+persistenceException.getMessage());

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return null;
    }

    @Override
    public Integer findTotal() {
        System.out.println("Running findTotal in temple repo ");
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        try {
            Query query= entityManager.createNamedQuery("findTotal");
            List<TempleEntity> entities= query.getResultList();
            System.out.println("Total Size Of Temple Entity: "+entities.size());
            entities.forEach(et-> System.out.println("Find All Entity is " +et));
            System.out.println();
            return entities.size();
        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: "+persistenceException.getMessage());

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return null;
    }

    @Override
    public TempleEntity findTempleByMaxEntryFee() {
        System.out.println("Running findTempleByMaxEntryFee in temple repo");
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        try {
            Query query= entityManager.createNamedQuery("findTempleByMaxEntryFee");
            Object object= query.getSingleResult();
            TempleEntity entity=(TempleEntity)object;
            System.out.println("Maximum EntryFee Temple is :"+entity);
            return entity;
        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: "+persistenceException.getMessage());

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return null;
    }

    @Override
    public void updateLocationByName(String location, String name) {
        System.out.println("Running updateLocationByName in temple repo location is : " +location+" and name is : "+name);
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        System.out.println("Associate Transaction");
        try {
            entityTransaction.begin();
            System.out.println("EntityTransaction Start");
            Query query=entityManager.createNamedQuery("updateLocationByName");
            query.setParameter("newLocation",location);
            query.setParameter("fName",name);
            int updatedRows = query.executeUpdate(); // Execute the update directly
            entityTransaction.commit();
            System.out.println("Temple location successfully updated for " + updatedRows + " rows where name is: " + name);

        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: " + persistenceException.getMessage());
            entityTransaction.rollback();

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
    }

    @Override
    public void updateEntryFeeByName(double fee, String name) {
        System.out.println("Running updateEntryFeeByName in temple repo EntryFee is : " +fee+" and name is : "+name);
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        System.out.println("Associate Transaction");
        try {
            entityTransaction.begin();
            System.out.println("EntityTransaction Start");
            Query query=entityManager.createNamedQuery("updateEntryFeeByName");
            query.setParameter("newFee",fee);
            query.setParameter("fName",name);
            int updatedRows = query.executeUpdate(); // Execute the update directly
            entityTransaction.commit();
            System.out.println("Temple EntryFee successfully updated for " + updatedRows + " rows where name is: " + name);

        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: " + persistenceException.getMessage());
            entityTransaction.rollback();

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
    }

    @Override
    public void updateLocationAndDimentionById(String location, double dimension, int id) {
        System.out.println("Running updateLocationAndDimentionById in temple repo Location is : " +location+" and Dimention is : "+dimension);
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        System.out.println("Associate Transaction");
        try {
            entityTransaction.begin();
            System.out.println("EntityTransaction Start");
            Query query=entityManager.createNamedQuery("updateLocationAndDimentionById");
            query.setParameter("newLocation",location);
            query.setParameter("newDimention",dimension);
            query.setParameter("fid",id);
            int updatedRows = query.executeUpdate(); // Execute the update directly
            entityTransaction.commit();
            System.out.println("Temple location and dimention successfully updated for " + updatedRows + " rows where id is: " + id);

        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: " + persistenceException.getMessage());
            entityTransaction.rollback();

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
    }

    @Override
    public void updateAllVipEntry(boolean entry, List<Integer> ids) {
        System.out.println("Running updateAllVipEntry in temple repo. VipEntry is: " + entry + " for temple IDs: " + ids);
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        System.out.println("Associate Transaction");

        try {
            entityTransaction.begin();
            System.out.println("EntityTransaction Start");

            Query query = entityManager.createNamedQuery("updateAllVipEntry");
            query.setParameter("newVipEntry", entry);
            query.setParameter("ids", ids);
            int updatedRows = query.executeUpdate();
            entityTransaction.commit();
            System.out.println("VipEntry successfully updated for " + updatedRows + " temples");

        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: " + persistenceException.getMessage());
            entityTransaction.rollback();

        } finally {
            entityManager.close();
            System.out.println("Closing resources");
        }
    }

    @Override
    public void deleteByName(String name) {
        System.out.println("Running deleteByName in temple repo Name is : " +name);
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        System.out.println("Created EntityManager");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        System.out.println("Associate Transaction");
        try {
            entityTransaction.begin();
            System.out.println("EntityTransaction Start");
            Query query=entityManager.createNamedQuery("deleteByName");
            query.setParameter("fName",name);
            int deletedRows = query.executeUpdate(); // Execute the delete directly
            entityTransaction.commit();
            System.out.println("Temple successfully deleted for " + deletedRows + " rows where name is: " + name);

        } catch (PersistenceException persistenceException) {
            System.out.println("PersistenceException: " + persistenceException.getMessage());
            entityTransaction.rollback();

        } finally {
            entityManager.close();
            System.out.println("closing resources");
        }
    }
}