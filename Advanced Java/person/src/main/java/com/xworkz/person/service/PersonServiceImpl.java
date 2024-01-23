package com.xworkz.person.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.person.dto.PersonDTO;
import com.xworkz.person.entity.Person;
import com.xworkz.person.repo.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<PersonDTO> getAllPersons() {
        List<Person> persons = personRepository.findAll();
        return persons.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PersonDTO getPersonById(Long id) {
        Person person = personRepository.findById(id).orElse(null);
        return (person != null) ? convertToDTO(person) : null;
    }

    @Override
    public void savePerson(PersonDTO personDTO) {
        Person person = convertToEntity(personDTO);
        personRepository.save(person);
    }

    @Override
    public void updatePerson(Long id, PersonDTO updatedPersonDTO) {
        Person existingPerson = personRepository.findById(id).orElse(null);

        if (existingPerson != null) {
            existingPerson.setFirstName(updatedPersonDTO.getFirstName());
            existingPerson.setLastName(updatedPersonDTO.getLastName());
            existingPerson.setAge(updatedPersonDTO.getAge());

            personRepository.save(existingPerson);
        }
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    private PersonDTO convertToDTO(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(person.getId());
        personDTO.setFirstName(person.getFirstName());
        personDTO.setLastName(person.getLastName());
        personDTO.setAge(person.getAge());
        return personDTO;
    }

    private Person convertToEntity(PersonDTO personDTO) {
        Person person = new Person();
        person.setFirstName(personDTO.getFirstName());
        person.setLastName(personDTO.getLastName());
        person.setAge(personDTO.getAge());
        return person;
    }
}
