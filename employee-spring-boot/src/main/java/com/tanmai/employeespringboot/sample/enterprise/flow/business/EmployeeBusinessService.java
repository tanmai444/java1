package com.tanmai.employeespringboot.sample.enterprise.flow.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tanmai.employeespringboot.sample.enterprise.flow.data.EmployeeDataService;

@Component
public class EmployeeBusinessService {

	@Autowired
	private EmployeeDataService employeeDataService;

}