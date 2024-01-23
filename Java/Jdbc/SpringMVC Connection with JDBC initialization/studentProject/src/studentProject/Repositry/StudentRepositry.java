package com.xworkz.studentProject.Repositry;

import java.sql.SQLException;

import com.xworkz.studentProject.dto.StudentProjectDTO;

public interface StudentRepositry {
	
	boolean save(StudentProjectDTO dto) throws SQLException, ClassNotFoundException;

}
