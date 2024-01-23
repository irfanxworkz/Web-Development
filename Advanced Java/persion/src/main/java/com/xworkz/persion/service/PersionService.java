package com.xworkz.persion.service;

import com.xworkz.persion.dto.PersionDTO;

import java.util.List;

public interface PersionService {
    List<PersionDTO> getAllPersons();
    PersionDTO getPersonById(Long id);
    void savePerson(PersionDTO personDTO);
    void updatePerson(Long id, PersionDTO updatedPersonDTO);
    void deletePerson(Long id);
}
