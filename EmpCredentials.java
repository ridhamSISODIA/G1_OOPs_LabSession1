package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface EmpCredentials {
	String generateEmailId(String fname,String lname,String dept);
	String generatePassword();
	void showDetails(Employee e);
}
