package com.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpa.entity.Employee;

// This will be AUTO IMPLEMENTED by Spring into a Bean called CustomerRepository
// CRUD refers Create, Read, Update, Delete

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
