package com.xworkz.iskonTemple.repositry;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

import com.xworkz.iskonTemple.dto.IskonTempleDTO;

public class RepositryImpl implements Repositry {

	private Collection<IskonTempleDTO> dtos = new LinkedList<IskonTempleDTO>();
	
	@Override
	public boolean save(IskonTempleDTO dto) {
		
		return dtos.add(dto);
	}

	@Override
	public Optional<IskonTempleDTO> finaByName(String name) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
