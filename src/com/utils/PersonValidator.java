package com.utils;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.Person;
@Component
public class PersonValidator implements Validator{

	@Override
	public boolean supports(Class<?> className) {
		// TODO Auto-generated method stub
		return Person.class.isAssignableFrom(className);
	}

	@Override
	public void validate(Object object, Errors err) {
		// TODO Auto-generated method stub
		Person p =(Person)object;
		if(p.getSno() == null || p.getSno()<10 || p.getSno()>1000)
			err.rejectValue("sno","sno.invalid");
		ValidationUtils.rejectIfEmpty(err, "name", "name.invalid");
		ValidationUtils.rejectIfEmpty(err, "city", "city.invalid");
	}

}
