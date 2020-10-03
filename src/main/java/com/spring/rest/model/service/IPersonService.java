package com.spring.rest.model.service;

import com.spring.rest.Controller.dto.PersonResponse;

import io.reactivex.Maybe;

public interface IPersonService {
	
	public Maybe<PersonResponse> findByDni(String dni);
}
