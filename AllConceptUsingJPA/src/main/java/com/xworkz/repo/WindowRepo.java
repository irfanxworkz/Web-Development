package com.xworkz.repo;

import com.xworkz.entity.WindowEntity;

import java.util.List;

public interface WindowRepo {

    default void save(WindowEntity entity){

    }

    default void saveAll(List<WindowEntity> entities){

    }

    default WindowEntity deleteMaterialByNAme(String name ){

        return null;
    }

    default WindowEntity updateClosedByFrame(Boolean status, String frame){

        return null;
    }

    default List<WindowEntity> findByFrame(String frame){

        return null;
    }

    default List<WindowEntity> findAll(){

        return null;
    }

    default List<String> findFrameColorAllEntity(){

        return null;
    }
}
