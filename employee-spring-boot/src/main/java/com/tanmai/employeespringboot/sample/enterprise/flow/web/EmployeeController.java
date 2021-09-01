package com.tanmai.employeespringboot.sample.enterprise.flow.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tanmai.employeespringboot.bean.Employee;
import com.tanmai.employeespringboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	// @Autowired
	// private EmployeeBusinessService employeeBusinessService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
		// return Arrays.asList(new Employee(1, "Tanmai Mukku", "TradeEdge",
		// "Engineering", "Product Engineer", "Junior"));
	}

	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployeeDetails(@PathVariable long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if (employee.isEmpty()) {
			throw new RuntimeException("Employee Not Found With id " + id);
		}
		return Optional.of(employee.get());
	}

	@PostMapping("/employees")
	public void createEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
	}

	@PutMapping("/employees/{id}")
	public void updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
		employeeRepository.save(employee);
	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if (employee.isEmpty()) {
			throw new RuntimeException("Employee Not Found With id " + id);
		}
		employeeRepository.deleteById(id);
	}


}


