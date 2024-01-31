package com.xworkz.runner;

import com.xworkz.entity.FertilizerEntity;
import com.xworkz.entity.TempleEntity;
import com.xworkz.repository.FertilizerRepo;
import com.xworkz.repository.FertilizerRepoImpl;
import com.xworkz.repository.TempleRepo;
import com.xworkz.repository.TempleRepoImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class RunnerForSingleTone {

    public static void main(String[] args) {

        TempleEntity templeEntity1=new TempleEntity("ISKCON Temple ","Rajaji Nagar",250,true, LocalDate.of(2010,5,15),"Sri Radha Krishna Temple");
        TempleEntity templeEntity2=new TempleEntity("Bull Temple","Habbal",60,true, LocalDate.of(2020,5,15),"Krishna");
        TempleEntity templeEntity3=new TempleEntity("Banashankari Temple.","Banswadi",130,false, LocalDate.of(2012,5,15),"Ganesh");
        TempleEntity templeEntity4=new TempleEntity("Kote Venkataramana Temple","Nandi Hills",110,true, LocalDate.of(2018,5,15),"Hanuman");
        TempleEntity templeEntity5=new TempleEntity("Dodda Ganesha Temple","Dodballapur",80,false, LocalDate.of(2001,5,15),"Ganesha");
        TempleRepo repo=new TempleRepoImpl();
        List<TempleEntity> entities= Arrays.asList(templeEntity1,templeEntity2,templeEntity3,templeEntity4,templeEntity5);
        repo.saveAll(entities);
    }
}
