package com.xworkz.person.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.xworkz.person.entity.Person;

public interface PersonRepository {
    List<Person> findAll();
    Optional<Person> findById(Long id);
    void save(Person person);
    void deleteById(Long id);
}