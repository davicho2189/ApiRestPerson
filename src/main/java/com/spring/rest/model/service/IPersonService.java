package com.spring.rest.model.service;

import com.spring.rest.Controller.dto.PersonResponse;
import com.spring.rest.model.entity.Person;

public interface IPersonService {
	
	public PersonResponse findByDni(String dni);
}
