package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private int mobile;

    private LocalDate dateOfBirth;
}
