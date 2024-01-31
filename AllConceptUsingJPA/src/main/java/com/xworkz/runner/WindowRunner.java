package com.xworkz.runner;

import com.xworkz.entity.WindowEntity;
import com.xworkz.repo.WindowRepo;
import com.xworkz.repo.WindowRepoImpl;

import java.util.Arrays;
import java.util.List;

public class WindowRunner {

    public static void main(String[] args) {

        WindowEntity entity1=new WindowEntity("Single-Hung Window","fiberglass",true,"Black");
        WindowEntity entity2=new WindowEntity("Double-Hung Window","wood",false,"Gray");
        WindowEntity entity3=new WindowEntity("Hopper Window","aluminum",true,"white");
        WindowEntity entity4=new WindowEntity("Center Pivot Window","vinyl",true,"Silver");
        List<WindowEntity> list= Arrays.asList(entity2,entity3,entity4);
        WindowRepo windowRepo=new WindowRepoImpl();
        windowRepo.save(entity1);
        windowRepo.saveAll(list);
        windowRepo.updateClosedByFrame(false,"white");
        windowRepo.deleteMaterialByNAme("Single-Hung Window");
        windowRepo.findByFrame("Gray");
        windowRepo.findAll();
        System.out.println("------------------------------------------------------------");
        windowRepo.findFrameColorAllEntity();
    }
}
