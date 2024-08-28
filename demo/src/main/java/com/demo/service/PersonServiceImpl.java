package com.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Address;
import com.demo.entity.Person;
import com.demo.entity.PersonDto;
import com.demo.repository.AddressRepository;
import com.demo.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Person addPerson(PersonDto personDto) {
		Optional<Address> address = addressRepository.findById(personDto.getCityId());
		if (address.get() != null) {
			Person person = new Person();
			person.setName(personDto.getName());
			person.setAge(personDto.getAge());
			person.setAddress(address.get());
			return personRepository.save(person);
		}
		return null;
	}

	@Override
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

	@Override
	public Person deletePerson(Long id) {
		Optional<Person> person = personRepository.findById(id);
		if(person.isPresent()) {
			personRepository.delete(person.get());
		}
		return person.get();
	}

	@Override
	public List<Person> getAllPersonsByCity(String city) {
		List<Person> list = personRepository.findAll();
		return list.stream().filter(e -> e.getAddress().getCityName().equalsIgnoreCase(city))
				.collect(Collectors.toList());
	}

}
