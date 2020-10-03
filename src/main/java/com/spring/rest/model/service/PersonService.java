package com.spring.rest.model.service;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.Controller.dto.PersonResponse;
import com.spring.rest.model.dao.PersonDao;
import com.spring.rest.model.entity.Person;

import io.reactivex.Maybe;
import io.reactivex.schedulers.Schedulers;

@Service
public class PersonService implements IPersonService{
  
	@Autowired
	private PersonDao personDao;
	
	
	@Override
	public Maybe<PersonResponse> findByDni(String dni) {
		
		Person person = personDao.findByDni(dni);
	  
		return person== null ? 
				Maybe.<PersonResponse>empty() :
					Maybe.just(person).map(this::toPersonResponse).subscribeOn(Schedulers.io());		
	}
	
	public PersonResponse toPersonResponse(Person person) throws Exception {				
		PersonResponse personResponse = new PersonResponse();
        BeanUtils.copyProperties(personResponse,person );            
        return personResponse;
    }

}
