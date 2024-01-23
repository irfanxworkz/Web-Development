package com.xworkz.person.service;

import java.util.List;

import com.xworkz.person.dto.PersonDTO;

public interface PersonService {
	
    List<PersonDTO> getAllPersons();
    PersonDTO getPersonById(Long id);
    void savePerson(PersonDTO personDTO);
    void updatePerson(Long id, PersonDTO updatedPersonDTO);
    void deletePerson(Long id);
}
