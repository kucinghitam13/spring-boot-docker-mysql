package com.example.springbootdocker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "person_test")
@Getter
@Setter
public class Person{
	@Id
	private int id;
	
	private String name;
}
