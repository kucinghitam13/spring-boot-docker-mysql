package com.example.springbootdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootdocker.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
