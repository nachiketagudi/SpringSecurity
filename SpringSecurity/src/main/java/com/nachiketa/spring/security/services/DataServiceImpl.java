package com.nachiketa.spring.security.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nachiketa.spring.security.model.Employee;

@Component
public class DataServiceImpl implements DataService  {

	
	
	 @Override
	 public List<Employee> getUserList() {
	  
	  // preparing user list with few hard coded values
	  List<Employee> userList = new ArrayList<Employee>();
	  
	  userList.add(new Employee(1, "nachiketa", "nachiketagudi@gmail.com", "9642423254"));
	  
	  
	  return userList;
	 }
	
}
