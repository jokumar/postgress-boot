package com.sample.postgress.dao;

import java.util.List;

import com.sample.postgress.entity.Employee;

public interface EmployeeDao {

	List<Employee> findAll();

	void insertEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void executeUpdateEmployee(Employee emp);

	public void deleteEmployee(Employee emp);
}
