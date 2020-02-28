package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.config.IDException;
import com.model.Person;
import com.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository prepo;
	
	public List<Person> getPeople()
	{
		return prepo.getPeople();
	}
	
	public void addPerson(Person p) throws IDException
	{
		Person person = prepo.getperson(p.getSno());
		if(person==null)
			prepo.addPerson(p);
		else
			throw new IDException();
		
	}
	
	
}
