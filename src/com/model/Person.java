package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@Id
	//@Column(name="xxx")
	private Integer sno;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column
	private String name;
	
	@Column
	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private String city;

	public Person(Integer sno, String name, String city) {
		super();
		this.sno = sno;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [sno=" + sno + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
}
