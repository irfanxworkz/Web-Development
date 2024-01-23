package com.xworkz.bulb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BulbDTO {

    private int id;
    private String brand;
    private String lightType;
    private String feature;
    private String wattage;
    private String shape;
    private String bulbBase;
    private  String lightColor;
    private String incandescentEquivalentWattage;
    private  String lightColour;
    private  int voltage;
    private int netQuantity;
}
