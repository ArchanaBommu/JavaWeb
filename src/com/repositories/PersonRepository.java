package com.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Person;

@Repository
@Transactional
public class PersonRepository {
	
	@Autowired
	SessionFactory sessionFactory;

	public List<Person> getPeople()
	{
		return sessionFactory.getCurrentSession().createCriteria(Person.class).list();
	}
	
	public void addPerson(Person p)
	{
		sessionFactory.getCurrentSession().save(p);
	}
	
	public Person getperson(Integer sno)
	{
		return (Person)sessionFactory.getCurrentSession().get(Person.class,sno);
	}
}
