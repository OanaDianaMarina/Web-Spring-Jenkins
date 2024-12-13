package com.mavenTask.webspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PersonRepo {
	private List<Person> people = new ArrayList<Person>();
	
	public PersonRepo() {
		people.add(new Person("Diana"));
	}
	
	public void addPerson(Person person) {
		people.add(person);
	}
	
	public List<Person> searchAll() {
		return people;
	}
}
