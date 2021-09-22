package com.dailycodechallege.departmentservice.Controller;

import com.dailycodechallege.departmentservice.Entity.Department;
import com.dailycodechallege.departmentservice.Service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @PostMapping ("/SaveDepartment")
    public Department saveDepartment(@RequestBody Department department)
    {
        log.info("Inside");
        return service.saveDepartment(department);
    }

    @GetMapping("/GetDepartment/{id}")
    public Department getDepartment(@PathVariable("id") Long departmentID)
    {
        return  service.getDepartment(departmentID);
    }
}
