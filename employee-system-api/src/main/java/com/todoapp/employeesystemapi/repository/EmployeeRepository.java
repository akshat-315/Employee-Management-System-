package com.todoapp.employeesystemapi.repository;

import com.todoapp.employeesystemapi.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
