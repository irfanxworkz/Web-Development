package com.xworkz.iskonTemple.services;

import com.xworkz.iskonTemple.dto.IskonTempleDTO;

public interface Services {

	public boolean validateAndSave(IskonTempleDTO dto);

	public boolean findByName(String name);
	
}
