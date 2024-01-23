package com.xworkz.studentProject.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.studentProject.Repositry.StudentRepositry;
import com.xworkz.studentProject.Repositry.StudentRepositryImpl;
import com.xworkz.studentProject.Services.StudentServices;
import com.xworkz.studentProject.Services.StudentServicesImpl;
import com.xworkz.studentProject.dto.StudentProjectDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/info")
public class StudentServlet extends HttpServlet{
	
	private StudentServices services;
	
	public StudentServlet() {
		System.out.println("Creating no-arg Constructor Using StudentProject!!!");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("Executing doPost method from StudentProject");
		
		StudentProjectDTO projectDTO = new StudentProjectDTO();
	
		projectDTO.setName(req.getParameter("name"));
		projectDTO.setQualifivcation(req.getParameter("qualification"));
		projectDTO.setStream(req.getParameter("stream"));
		projectDTO.setCourse(req.getParameter("course"));
		projectDTO.setCollege(req.getParameter("college"));
		projectDTO.setCity(req.getParameter("city"));
		projectDTO.setState(req.getParameter("state"));
		projectDTO.setCountry(req.getParameter("country"));
		
		req.setAttribute("StudentName", req.getParameter("name"));
		req.setAttribute("StudentQualification", req.getParameter("qualification"));
		req.setAttribute("StudentStream", req.getParameter("stream"));
		req.setAttribute("StudentCourse", req.getParameter("course"));
		req.setAttribute("StudentCollege", req.getParameter("college"));
		req.setAttribute("StudentCity", req.getParameter("city"));
		req.setAttribute("StudentState", req.getParameter("state"));
		req.setAttribute("StudentCountry", req.getParameter("country"));
		
		StudentRepositry repo=new StudentRepositryImpl();
		services=new StudentServicesImpl(repo);
		try {
			services.validateAndSave(projectDTO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher ds = req.getRequestDispatcher("/display.jsp");
		ds.forward(req, resp);
	}

}
