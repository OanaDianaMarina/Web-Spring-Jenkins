package com.mavenTask.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PersonRESTController {

	 @Autowired
	 private PersonService svc;
	 
	 public void add(Person person) {
		 svc.addPerson(person);
	 }

	 @GetMapping
	public List<Person> searchAll() {
		return svc.searchAll();
	}
	 
	 
}
