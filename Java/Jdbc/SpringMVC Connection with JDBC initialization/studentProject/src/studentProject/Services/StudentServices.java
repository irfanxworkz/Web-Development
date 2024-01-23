package com.xworkz.studentProject.Services;

import java.sql.SQLException;

import com.xworkz.studentProject.dto.StudentProjectDTO;

public interface StudentServices {

	 boolean validateAndSave(StudentProjectDTO dto) throws ClassNotFoundException, SQLException;
}
