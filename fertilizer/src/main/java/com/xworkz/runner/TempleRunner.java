package com.xworkz.runner;

import com.xworkz.entity.TempleEntity;
import com.xworkz.repository.TempleRepo;
import com.xworkz.repository.TempleRepoImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TempleRunner {

    public static void main(String[] args) {

        TempleEntity templeEntity=new TempleEntity("Shiva Temple","Kurubrahalli",150,true, LocalDate.of(2022,5,15),"Shiva");

        TempleEntity templeEntity1=new TempleEntity("ISKCON Temple ","Rajaji Nagar",250,true, LocalDate.of(2010,5,15),"Sri Radha Krishna Temple");
        TempleEntity templeEntity2=new TempleEntity("Bull Temple","Habbal",60,true, LocalDate.of(2020,5,15),"Krishna");
        TempleEntity templeEntity3=new TempleEntity("Banashankari Temple.","Banswadi",130,false, LocalDate.of(2012,5,15),"Ganesh");
        TempleEntity templeEntity4=new TempleEntity("Kote Venkataramana Temple","Nandi Hills",110,true, LocalDate.of(2018,5,15),"Hanuman");
        TempleEntity templeEntity5=new TempleEntity("Dodda Ganesha Temple","Dodballapur",80,false, LocalDate.of(2001,5,15),"Ganesha");
        TempleRepo repo=new TempleRepoImpl();
       // repo.save(templeEntity);

        List<TempleEntity> entities= Arrays.asList(templeEntity1,templeEntity2,templeEntity3,templeEntity4,templeEntity5);
        //repo.saveAll(entities);
        repo.findAllByLocation("BasavesraNagar");
        System.out.println("--------------------------------------------------");
       List<TempleEntity> list= repo.findAllByEntryFeeGreaterThan(100);
        list.forEach(et-> System.out.println("Entity in Runner Class "+et));
        System.out.println("---------------------------------------------------");

        repo.findAllByInagrudatedDateGreaterThan(LocalDate.of(2011,3,25));
        System.out.println("-----------------------------------------------------");

        repo.findAllByMainGodAndLocation("Shiva","Kurubrahalli");
        System.out.println("---------------------------------------------------");

        repo.findById(3);
        System.out.println("---------------------------------------------------");

        repo.findByIdAndMainGod(2,"Sri Radha Krishna Temple");
        System.out.println("------------------------------------------------");

        Integer i=repo.findTotal();
        System.out.println("Total Size Of TempleEntity in runner is " +i);
        System.out.println("----------------------------------------------------");
        repo.findTempleByMaxEntryFee();
        System.out.println("-----------------------------------------------------");
        repo.updateLocationByName("BasavesraNagar","Bull Temple");
        System.out.println("-----------------------------------------------------");
        repo.updateAllVipEntry(false,Arrays.asList(1,2,3,5));
        System.out.println("--------------------------------------------------------");
        repo.updateEntryFeeByName(77.8,"Dodda Ganesha Temple");
        System.out.println("--------------------------------------------------");
        repo.deleteByName("Kote Venkataramana Temple");
        System.out.println("-------------------------------------------------------");
        repo.updateLocationAndDimentionById("Pratap Nagar",1500.23,3);

    }
}
