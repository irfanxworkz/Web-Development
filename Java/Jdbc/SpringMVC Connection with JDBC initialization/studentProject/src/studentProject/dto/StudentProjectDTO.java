package com.xworkz.studentProject.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentProjectDTO implements Serializable{
	
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 10)
	private String name;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 10)
	private String qualifivcation;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 5)
	private String stream;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 10)
	private String course;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 10)
	private String college;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 20)
	private String city;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 10)
	private String state;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 20)
	private String country;

}
