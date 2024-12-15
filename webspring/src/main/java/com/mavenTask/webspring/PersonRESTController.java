package com.mavenTask.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mavenTask.webspring.dtos.PersonDto;
import com.mavenTask.webspring.dtos.PersonMapper;
import com.mavenTask.webspring.models.Person;

@RestController
@RequestMapping("/people")
public class PersonRESTController {

	 @Autowired
	 private PersonService svc;
	 
	 public void add(PersonDto personDto) {
		 svc.addPerson(PersonMapper.toBO(personDto));
	 }

	 @GetMapping
	public List<PersonDto> searchAll() {
		return svc.searchAll().stream().map((p)->new PersonDto(p.getName())).toList();
	}
	 
	 
}
