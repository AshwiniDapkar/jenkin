package com.CRUD.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	Optional<Employee> findByName(String name);

}
