package com.example.employeemanagementsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	@Column(name = "department")
	private String department;

	@Column(name = "designation")
	private String designation;

	@Column(name = "salary")
	private int salary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() { return department; }

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() { return designation; }

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() { return salary; }

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
