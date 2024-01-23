package com.xworkz.studentProject.Repositry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.mysql.cj.xdevapi.Statement;
import com.xworkz.studentProject.dto.StudentProjectDTO;
import com.xworkz.studentProject.util.Util;

public class StudentRepositryImpl implements StudentRepositry {

	//private Collection<StudentProjectDTO> dtos = new ArrayList<StudentProjectDTO>();

	@Override
	public boolean save(StudentProjectDTO dto) throws SQLException, ClassNotFoundException {
		int i = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection(Util.jdbcUrl, Util.userName, Util.password)) {

			PreparedStatement stmt = connection.prepareStatement("insert into details values(?,?,?,?,?,?,?,?)");
			stmt.setString(1, dto.getName());
			stmt.setString(2, dto.getQualifivcation());
			stmt.setString(3, dto.getStream());
			stmt.setString(4, dto.getCourse());
			stmt.setString(5, dto.getCollege());
			stmt.setString(6, dto.getCity());
			stmt.setString(7, dto.getState());
			stmt.setString(8, dto.getCountry());

			i = stmt.executeUpdate();
			System.out.println(i + "row inserted");
		}
		if (i != 0) {
			return true;
		}
		return false;
	}

}
