package com.xworkz.repository;

import com.xworkz.entity.TempleEntity;

import java.time.LocalDate;
import java.util.List;

public interface TempleRepo {

    default void save(TempleEntity entity){

    }
    default void saveAll(List<TempleEntity> entities){

    }
    default List<TempleEntity> findAllByLocation(String location){

        return null;
    }
    default List<TempleEntity> findAllByEntryFeeGreaterThan(double fee){

        return null;
    }
    default List<TempleEntity> findAllByEntryFeeBetween(double startFee, double lastFee){

        return null;
    }
    default List<TempleEntity> findAllByInagrudatedDateGreaterThan(LocalDate date){

        return null;
    }
    default List<TempleEntity> findAllByMainGodAndLocation(String mainGod ,String location){

        return null;
    }
    default TempleEntity findById(int id){

        return null;
    }
    default TempleEntity findByIdAndMainGod(int id,String mainGod){

        return null;
    }

    default Integer findTotal(){

        return null;
    }
    default TempleEntity findTempleByMaxEntryFee(){

        return null;
    }

    default void updateLocationByName(String location,String name){

    }

    default void updateEntryFeeByName(double fee,String name){

    }

    default void updateLocationAndDimentionById(String location,double dimension,int id){

    }

    default void updateAllVipEntry(boolean entry,List<Integer> ids){

    }

    default void deleteByName(String name){

    }

}
