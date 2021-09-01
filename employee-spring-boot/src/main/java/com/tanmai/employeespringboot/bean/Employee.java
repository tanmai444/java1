package com.tanmai.employeespringboot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long id;

	private String name;
	private String divison;
	private String department;
	private String position;
	private String designation;
	
	public Employee() {

	}

	public Employee(long id, String name, String divison, String department, String position, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.divison = divison;
		this.department = department;
		this.position = position;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", divison=" + divison + ", department=" + department
				+ ", position=" + position + ", designation=" + designation + "]";
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDivison() {
		return divison;
	}

	public String getDepartment() {
		return department;
	}

	public String getPosition() {
		return position;
	}

	public String getDesignation() {
		return designation;
	}

}
