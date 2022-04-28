package com.CRUD.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.demo.entity.Employee;
import com.CRUD.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
		return service.saveEmployees(employees);
	}
	
	@GetMapping("/findAllEmployees")
	public List<Employee> findAllEmployee()
	{
		return service.getEmployees();
			}
	@GetMapping("/findEmployee/{id}")
	public Employee findEmployeeById(@PathVariable int id)
	{
		return service.getEmployeeById(id);
			}
	
	@GetMapping("/findAllEmployeeByAsc")
	public List<Employee>  findEmployeeByName()
	{
		return service.getEmployeeByName();
			}
		
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
		}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
		
	}
	
	
	

	
}
