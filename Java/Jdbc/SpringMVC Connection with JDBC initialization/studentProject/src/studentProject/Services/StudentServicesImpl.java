package com.xworkz.studentProject.Services;

import java.sql.SQLException;

import com.xworkz.studentProject.Repositry.StudentRepositry;
import com.xworkz.studentProject.dto.StudentProjectDTO;
import com.xworkz.studentProject.util.Util;

public class StudentServicesImpl implements StudentServices {

	private Util validate = new Util();
	
	private StudentRepositry repositry;
	public StudentServicesImpl(StudentRepositry repositry) {
	 this.repositry=repositry;
	}

	@Override
	public boolean validateAndSave(StudentProjectDTO dto) throws ClassNotFoundException, SQLException {
		System.out.println("running validateAndSave Method...");
		if (dto != null) {
			System.out.println("dto is not null");

			if (validate.validDTO(dto)) {
				System.out.println("No constraint violatino found in dto " + dto);
				return this.repositry.save(dto);
			}
		} else {
			System.out.println("dto is null");
		}
		return false;
	}

}
