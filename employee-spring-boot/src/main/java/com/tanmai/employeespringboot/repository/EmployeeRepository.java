package com.tanmai.employeespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanmai.employeespringboot.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
