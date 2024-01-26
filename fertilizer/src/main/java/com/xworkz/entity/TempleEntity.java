package com.xworkz.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "temple")

@NamedQuery(name = "findAllByLocation", query = "select et from TempleEntity as et where et.location=:lcn")

@NamedQuery(name = "findAllByEntryFeeGreaterThan",query = "select et from TempleEntity as et where et.entryFee > :etrfee")

@NamedQuery(name = "findAllByEntryFeeBetween",query = "select et from TempleEntity as et where et.entryFee Between :strfee and :lstfee")
@NamedQuery(name = "findAllByInagrudatedDateGreaterThan",query = "select et from TempleEntity as et where et.inaguratedDate > :inugrateDate")
@NamedQuery(name = "findAllByMainGodAndLocation",query = "select et from TempleEntity as et where et.location=:lcn and et.mainGod=:mGod")
@NamedQuery(name = "findById",query = "select et from TempleEntity as et where et.id=:tid")
@NamedQuery(name = "findByIdAndMainGod",query = "select et from TempleEntity as et where et.id=:tid1 and et.mainGod=:mGod")
@NamedQuery(name = "findTotal",query = "select et from TempleEntity as et ")
@NamedQuery( name = "findTempleByMaxEntryFee", query = "select et from TempleEntity et where et.entryFee = (select MAX(et2.entryFee) from TempleEntity et2)")

@NamedQuery( name = "updateLocationByName", query = "update TempleEntity et set et.location=:newLocation where et.name=:fName")

@NamedQuery( name = "updateEntryFeeByName", query = "update TempleEntity et set et.entryFee=:newFee where et.name=:fName")

@NamedQuery( name = "updateLocationAndDimentionById", query = "update TempleEntity et set et.location = :newLocation, et.dimention = :newDimention WHERE et.id = :fid")
@NamedQuery( name = "updateAllVipEntry", query = "update TempleEntity et set et.vipEntry=:newVipEntry where et.id IN :ids")

@NamedQuery( name = "deleteByName", query = "DELETE FROM TempleEntity et WHERE et.name = :fName")
public class TempleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    @Column(name = "temple_Name")
    private String name;
    @NonNull
    @Column(name = "temple_Location")
    private String location;
    @NonNull
    @Column(name = "temple_EntryFee")
    private double entryFee;
    @NonNull
    @Column(name = "temple_VipEntry")
    private boolean vipEntry;
    @NonNull
    @Column(name = "temple_InaguratedDate")
    private LocalDate inaguratedDate;
    @NonNull
    @Column(name = "temple_MainGod")
    private String mainGod;

    @Column(name = "temple_dimention")
    private double dimention;



}
