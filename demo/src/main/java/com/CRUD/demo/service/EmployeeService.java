package com.CRUD.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.CRUD.demo.entity.Employee;
import com.CRUD.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
			}
	public List <Employee> saveEmployees(List <Employee> employees) {
		return repository.saveAll(employees);
			}
	
	public List <Employee> getEmployees() {
		return repository.findAll();			
}
	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
			}
	public List<Employee> getEmployeeByName() {
return repository.findAll(Sort.by("name").ascending());
			}
	
	public String deleteEmployee(int id) {
		 repository.deleteById(id);
		 return "deleted successfully "+id;
	}
	
	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee=repository.findById(employee.getId()).orElse(null);
		existingEmployee.setSalary(employee.getSalary());
		return repository.save(existingEmployee);
		}
	}
