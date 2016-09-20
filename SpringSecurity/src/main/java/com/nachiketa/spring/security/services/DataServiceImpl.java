package com.nachiketa.spring.security.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nachiketa.spring.security.model.User;

@Component
public class DataServiceImpl implements DataService  {

	
	
	 @Override
	 public List<User> getUserList() {
	  
	  // preparing user list with few hard coded values
	  List<User> userList = new ArrayList<User>();
	  
	  userList.add(new User(1, "nachiketa", "nachiketa@caliberassurance.com", "9642423254"));
	  
	  
	  return userList;
	 }
	
}
