package com.rahul.employee_service.repository;

import com.rahul.employee_service.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();


    public Employee addEmployee(Employee theEmployee) {
        employees.add(theEmployee);
        return theEmployee;
    }

    public Employee findById(Long theId) {
        return employees.stream()
                .filter(employee -> employee.id().equals(theId))
                .findFirst()
                .orElseThrow();

    }

    public List<Employee> findAll(){return employees;}

    public List<Employee> findByDepartment(Long id){
        return employees.stream()
                .filter(employee -> employee.departmentId().equals(id))
                .toList();
    }
}
