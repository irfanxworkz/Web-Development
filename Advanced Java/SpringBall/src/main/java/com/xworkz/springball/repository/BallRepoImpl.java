package com.xworkz.springball.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.springball.dto.BallDTO;

@Repository
public class BallRepoImpl  implements BallRepository{

	@Override
	public boolean save(BallDTO ballDTO) {
		System.out.println("calling the save method from BallReposityr to ballrepoImpl..");
		return true;
	}

}
