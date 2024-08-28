package com.demo.service;

import java.util.List;

import com.demo.entity.Person;
import com.demo.entity.PersonDto;

public interface PersonService {
	
	Person addPerson(PersonDto personDto);
	List<Person> getAllPersons();
	
	Person deletePerson(Long id);
	
	List<Person> getAllPersonsByCity(String city);

}
