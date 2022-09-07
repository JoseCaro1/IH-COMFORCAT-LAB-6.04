package com.ironhack.lab.services;

import com.ironhack.lab.models.Employee;
import com.ironhack.lab.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public void removeEmployee(Long id) {
        if(!employeeRepository.findById(id).isPresent())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Employee not found");
        employeeRepository.deleteById(id);
    }
}
