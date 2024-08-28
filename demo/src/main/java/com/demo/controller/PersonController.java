package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Person;
import com.demo.entity.PersonDto;
import com.demo.service.PersonService;

@RestController
@RequestMapping("api/v1/persons")
public class PersonController {

	@Autowired
	private PersonService personService;

	@PostMapping
	public Person addPerson(@RequestBody PersonDto personDto) {
		return personService.addPerson(personDto);
	}

	@GetMapping
	public List<Person> getAll() {
		return personService.getAllPersons();
	}

	@DeleteMapping("/{id}")
	public Person delete(@PathVariable Long id) {
		return personService.deletePerson(id);
	}

}
