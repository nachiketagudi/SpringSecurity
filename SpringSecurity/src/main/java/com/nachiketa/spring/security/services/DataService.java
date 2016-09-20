package com.nachiketa.spring.security.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nachiketa.spring.security.model.Employee;

@Component
public interface DataService {
	 public List<Employee> getUserList();
}
