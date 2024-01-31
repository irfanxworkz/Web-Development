package com.xworkz.runner;

import com.xworkz.entity.FertilizerEntity;
import com.xworkz.repository.FertilizerRepo;
import com.xworkz.repository.FertilizerRepoImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FertilizerRunnerWithRepo {

    public static void main(String[] args) {
        FertilizerEntity fertilizerEntity1=new FertilizerEntity("Urea", LocalDate.of(2019,5,25),LocalDate.of(2026,6,14),10,1500);
        FertilizerEntity fertilizerEntity2=new FertilizerEntity("Sodium", LocalDate.of(2012,5,25),LocalDate.of(2025,6,14),20,1800);
        FertilizerEntity fertilizerEntity3=new FertilizerEntity("Zink", LocalDate.of(2021,5,25),LocalDate.of(2023,6,14),30,1780);
        List<FertilizerEntity> entities= Arrays.asList(fertilizerEntity1,fertilizerEntity2,fertilizerEntity3);
        FertilizerRepo fertilizerRepo=new FertilizerRepoImpl();
       // System.out.println(entities);
        //fertilizerRepo.save(fertilizerEntity);
       fertilizerRepo.saveAll(entities);

       List<FertilizerEntity> list= fertilizerRepo.findAll(20);
       list.forEach(e->System.out.println("Entity By Quantity is  "+e.getQuantity()+" : "+e));
    }
}
