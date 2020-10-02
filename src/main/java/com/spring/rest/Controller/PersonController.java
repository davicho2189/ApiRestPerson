package com.spring.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.Controller.dto.PersonResponse;
import com.spring.rest.model.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/person/info/{dni}")
	public PersonResponse GetPersonInfo(@PathVariable String dni)
	{
		
		PersonResponse personResponse = personService.findByDni(dni);		
		return personResponse;
	}
	
}
