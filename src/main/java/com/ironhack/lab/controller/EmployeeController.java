package com.ironhack.lab.controller;

import com.ironhack.lab.models.Employee;
import com.ironhack.lab.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("employee/find-all")
    @CrossOrigin
    public List<Employee> findAll() {
        return employeeService.getAll();
    }

    @DeleteMapping("employee/{id}")
    @CrossOrigin
    public void remove(@PathVariable Long id) {
        employeeService.removeEmployee(id);
    }
}
