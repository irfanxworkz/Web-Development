package com.xworkz.springball.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springball.dto.BallDTO;
import com.xworkz.springball.repository.BallRepository;

@Service
public class BallServiceImpl implements BallService {
	@Autowired
	private BallRepository ballRepository;

	@Override
	public boolean saveAndValidate(BallDTO ballDTO) {
		System.out.println("calling the saveandvalidate from ballservice to ballserviceImpl...");
		return true;
	}

}
