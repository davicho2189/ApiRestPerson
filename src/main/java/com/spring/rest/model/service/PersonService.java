package com.spring.rest.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.Controller.dto.PersonResponse;
import com.spring.rest.model.dao.PersonDao;
import com.spring.rest.model.entity.Person;

@Service
public class PersonService implements IPersonService{
  
	@Autowired
	private PersonDao personDao;
	
	
	@Override
	public PersonResponse findByDni(String dni) {
		
		Person person = personDao.findByDni(dni);
		PersonResponse personResponse = new PersonResponse(person.getDni(),person.getName(),person.getLastName(),person.getFechaNac());
		return personResponse;
		
	
		
	}

}
