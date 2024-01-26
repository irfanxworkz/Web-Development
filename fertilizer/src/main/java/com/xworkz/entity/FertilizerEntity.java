package com.xworkz.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "fertilizer")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findAllByquantity", query = "select et from FertilizerEntity as et where et.quantity=:qt")
public class FertilizerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    @Column(name = "name")
    private String name;
    @NonNull
    @Column(name = "mfgDate")
    private LocalDate mfgDate;
    @NonNull
    @Column(name = "expireDate")
    private LocalDate expireDate;
    @NonNull
    @Column(name = "quentity")
    private int quantity;
    @NonNull
    @Column(name = "cost")
    private double cost;

}



