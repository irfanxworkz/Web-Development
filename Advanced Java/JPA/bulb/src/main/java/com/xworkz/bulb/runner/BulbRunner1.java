package main.java.com.xworkz.bulb.runner;

import com.xworkz.bulb.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BulbRunner1 {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("com.xworkz");
       EntityManager entityManager= entityManagerFactory.createEntityManager();
      Query query= entityManager.createNamedQuery("findBrandNameLightTypeAndVoltage");
      query.setParameter("lid",2);
      Object object= query.getSingleResult();
      Object[] objects=(Object[])object;
        System.out.println("Brand Name : "+objects[0]);
        System.out.println("Light Type : "+objects[1]);
        System.out.println("Voltage : "+objects[2]);

        System.out.println("---------------------------------");
        Query query1= entityManager.createNamedQuery("findAll");
        List<BulbEntity> bulbEntities= query1.getResultList();
        for (BulbEntity entity: bulbEntities){
            System.out.println(entity);
        }
    }
}
