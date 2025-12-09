package com.rahul.employee_service.controller;

import com.rahul.employee_service.model.Employee;
import com.rahul.employee_service.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepo;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping
    public Employee add(@RequestBody Employee theEmployee){
        LOGGER.info("Employee added : {}", theEmployee);
        return employeeRepo.addEmployee(theEmployee);
    }

    @GetMapping
    public List<Employee> findAll(){
        LOGGER.info("Employee get all");
        return employeeRepo.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id){
        LOGGER.info("Employee found: {}", id);
        return employeeRepo.findById(id);
    }


    @GetMapping("/department/{id}")
    public List<Employee> findByDepartment(@PathVariable Long id){
        LOGGER.info("Employee found: {}", id);
        return employeeRepo.findByDepartment(id);
    }
}
