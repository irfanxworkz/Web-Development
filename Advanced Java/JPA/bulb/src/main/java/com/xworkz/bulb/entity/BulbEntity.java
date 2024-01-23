package com.xworkz.bulb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "bulb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findbyShap", query = "select et from BulbEntity as et where et.shape=:sp")
@NamedQuery(name = "findBrandNameLightTypeAndVoltage", query = "select light.brand,light.lightType,light.voltage from BulbEntity as light where light.id=:lid")
@NamedQuery(name = "findAll", query = "select entity from BulbEntity as entity")
public class BulbEntity {


    @Id
    private int id;
    private String brand;
    @Column(name = "light_Type")
    private String lightType;
    private String feature;
    private String wattage;
    private String shape;
    private String bulbBase;
    private String lightColor;
    private String incandescentEquivalentWattage;
    private String lightColour;
    private int voltage;
    private int netQuantity;

}
