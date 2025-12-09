package com.rahul.department_service.repository;

import com.rahul.department_service.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
public class DepartmentRepository {
    private List<Department> departments = new ArrayList<>();

    public Department addDepartment(Department theDepartment) {
        departments.add(theDepartment);
        return theDepartment;
    }

    public Department findById(Long theId) {
        return departments.stream()
                .filter(department -> department.getId().equals(theId))
                .findFirst()
                .orElseThrow();

    }

    public List<Department> findAll(){return departments;}
}
