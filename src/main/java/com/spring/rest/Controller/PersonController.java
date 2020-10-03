package com.spring.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.Controller.dto.PersonResponse;
import com.spring.rest.model.service.PersonService;

import io.reactivex.Maybe;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/person/info/{dni}")
	public Maybe<PersonResponse> GetPersonInfo(@PathVariable String dni)
	{		
	    Maybe<PersonResponse> personResponse = personService.findByDni(dni);		
		return personResponse;
	}
	
}
