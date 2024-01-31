package com.xworkz.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "window_Table")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@NamedQuery(name = "deleteMaterialByNAme",query = "delete WindowEntity et where et.windowName=:wName")
@NamedQuery(name = "updateClosedByFrame" ,query = "update WindowEntity et set et.closed=:wStatus where et.frameColor=:wfColor")
@NamedQuery(name = "findByFrame", query = "select et from WindowEntity et where et.frameColor=:fColor")
@NamedQuery(name = "findAll",query = "select et from WindowEntity et")
@NamedQuery(name = "findAllFrameColor" ,query = "select et.frameColor from WindowEntity et")

public class WindowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @Column(name = "Window_Name")
    private String windowName;
    @NonNull
    @Column(name = "Window_Material")
    private String windowMaterial;
    @NonNull
    @Column(name = "Window_Status")
    private boolean closed;
    @NonNull
    @Column(name = "Window_FrameColor")
    private String frameColor;


}
