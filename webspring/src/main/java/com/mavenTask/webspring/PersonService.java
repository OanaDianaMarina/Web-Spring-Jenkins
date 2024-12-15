package com.mavenTask.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mavenTask.webspring.models.Person;

@Service
public class PersonService {

	@Autowired
	private PersonRepo repo;

	public void addPerson(Person person) {
		repo.addPerson(person);
	}

	public List<Person> searchAll() {
		return repo.searchAll();
	}
	
	
}
