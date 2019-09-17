package com.example.springbootdocker;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springbootdocker.entity.Person;
import com.example.springbootdocker.repository.PersonRepository;

@SpringBootApplication
public class SpringBootDockerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

	@Autowired
	private PersonRepository personRepository;

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		Person person = new Person();
		person.setId(1);
		person.setName("Dika Adhitama");
		personRepository.save(person);
	}
}

