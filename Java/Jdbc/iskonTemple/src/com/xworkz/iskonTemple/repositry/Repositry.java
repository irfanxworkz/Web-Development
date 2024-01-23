package com.xworkz.iskonTemple.repositry;

import java.util.Optional;

import com.xworkz.iskonTemple.dto.IskonTempleDTO;

public interface Repositry {
	
	 boolean save(IskonTempleDTO dto);
	
	Optional<IskonTempleDTO> finaByName(String name);
	

}
