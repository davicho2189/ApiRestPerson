package com.spring.rest.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.model.entity.Person;


public interface PersonDao extends JpaRepository<Person, Long>{

	Person findByDni(String dni);

	
	
}
