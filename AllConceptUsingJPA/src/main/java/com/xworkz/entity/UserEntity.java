package com.xworkz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findFirstNameAndLastNameByEmail", query = "select et.firstName,et.lastName from UserEntity as et where et.email=:uemail")
@NamedQuery(name = "findMobileAndDateOfBirthByFirstName", query = "select et.mobile,et.dateOfBirth from UserEntity as et where et.firstName=:uFirstName")
public class UserEntity {

    @Id
    private int id;
    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Mobile")
    private int mobile;
    @Column(name = "DOB")
    private LocalDate dateOfBirth;
}
