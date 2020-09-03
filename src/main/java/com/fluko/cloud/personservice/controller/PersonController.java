package com.fluko.cloud.personservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fluko.cloud.personservice.entity.PersonEntity;
import com.fluko.cloud.personservice.repository.PersonRepository;

@RestController
@RequestMapping("/store")
public class PersonController {
	

	@Autowired
	PersonRepository personRepository;

	//CREATE
	@PostMapping(path = "/person", consumes = "application/json", produces = "application/json")
	public PersonEntity create(@RequestBody PersonEntity personEntity){
		personRepository.save(personEntity);
		return personEntity;
	}
	
	//READ ALL
	@GetMapping("/persons")
	public List<PersonEntity> findAll(){
		List<PersonEntity> persons = personRepository.findAll();
		return persons;
	}
	
	//READ ONE
	@GetMapping("/persons/{id}")
	public Optional<PersonEntity> findOne(@PathVariable long id){
		Optional<PersonEntity> personEntity  = personRepository.findById(id);
		return personEntity;
	}
	
	//UPDATE
	@PutMapping(path = "/person", consumes = "application/json", produces = "application/json")
	public PersonEntity update(@RequestBody PersonEntity personEntity){
		personRepository.save(personEntity);
		return personEntity;
	}
	
	//DELETE
	@DeleteMapping(path = "/person", consumes = "application/json", produces = "application/json")
	public PersonEntity delte(@RequestBody PersonEntity personEntity){
		personRepository.delete(personEntity);
		return personEntity;
	}
}
