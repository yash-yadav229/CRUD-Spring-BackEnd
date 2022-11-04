package com.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
