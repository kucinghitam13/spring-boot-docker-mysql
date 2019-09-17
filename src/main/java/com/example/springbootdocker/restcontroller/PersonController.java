package com.example.springbootdocker.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdocker.entity.Person;
import com.example.springbootdocker.repository.PersonRepository;

@RestController
public class PersonController {
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping
	public List<Person> hello() {
		return personRepository.findAll();
	}
}
