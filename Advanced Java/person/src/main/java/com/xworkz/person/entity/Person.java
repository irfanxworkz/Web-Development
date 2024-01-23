package com.xworkz.person.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Person {

    //@Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "first_name")
    private String firstName;

   // @Column(name = "last_name")
    private String lastName;

    private int age;

    // Constructors, getters, setters (omitted for brevity)

    // Named Queries

    // Named Query to retrieve all persons
   // @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")

    // Named Query to find person by ID
    //@NamedQuery(name = "Person.findById", query = "SELECT p FROM Person p WHERE p.id = :id")

    // Named Query to delete person by ID
    //@NamedQuery(name = "Person.deleteById", query = "DELETE FROM Person p WHERE p.id = :id")
}