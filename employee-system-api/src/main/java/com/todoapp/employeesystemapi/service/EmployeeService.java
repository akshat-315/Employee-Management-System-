package com.todoapp.employeesystemapi.service;

import com.todoapp.employeesystemapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    //create employee
    Employee createEmployee(Employee employee);

    //get all employees
    List<Employee> getAllEmployees();

    //delete employee
    boolean deleteEmployee(Long id);

    //get employee by Id
    Employee getEmployeeById(Long id);

    //update employee
    Employee updateEmployee(Long Id, Employee employee);
}
