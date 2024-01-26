package com.xworkz.repository;

import com.xworkz.entity.FertilizerEntity;

import java.util.Collections;
import java.util.List;

public interface FertilizerRepo {

    Integer save(FertilizerEntity fertilizerEntity);

   default void saveAll(List<FertilizerEntity> list){

   }
   default List<FertilizerEntity> findAll(int quantity){

       return Collections.emptyList();

   }
}
