package com.sample.postgress.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.service.EmployeeService;

@RestController
@RequestMapping("/postgressApp")
public class ApplicationController {

	@Resource 
	EmployeeService employeeService;
	
	@GetMapping(value = "/employeeList")
	public List<Employee> getEmployees() {
		return employeeService.findAll();
	
	}
	
	@PostMapping(value = "/createEmp")
	public void createEmployee(@RequestBody Employee emp) {
		 employeeService.insertEmployee(emp);
	
	}
	@PutMapping(value = "/updateEmp")
	public void updateEmployee(@RequestBody Employee emp) {
		 employeeService.updateEmployee(emp);
	
	}
	@PutMapping(value = "/executeUpdateEmp")
	public void executeUpdateEmployee(@RequestBody Employee emp) {
		 employeeService.executeUpdateEmployee(emp);
	
	}
	
	@DeleteMapping(value = "/deleteEmpById")
	public void deleteEmployee(@RequestBody Employee emp) {
		 employeeService.deleteEmployee(emp);
	
	}
	
	
}
