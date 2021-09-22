package com.dailycodechallege.departmentservice.Service;

import com.dailycodechallege.departmentservice.Entity.Department;
import com.dailycodechallege.departmentservice.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository deptRepository;

    public Department saveDepartment(Department department) {

        return deptRepository.save(department);

    }

    public Department getDepartment(Long departmentID) {

        Optional<Department> department = deptRepository.findById(departmentID);
        return department.get();
    }
}
