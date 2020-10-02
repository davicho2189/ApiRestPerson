package com.spring.rest.Controller.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonResponse {
		
	private String dni;
	private String name;
	private String lastName;	
	private Date fechaNac;
}
