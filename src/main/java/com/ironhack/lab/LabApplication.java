package com.ironhack.lab;

import com.ironhack.lab.models.Employee;
import com.ironhack.lab.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabApplication implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(LabApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(new Employee("Jose", "123", "321", "Hi", "Pepe"));
        employeeRepository.save(new Employee("Ale", "123", "321", "Hi", "Pepe"));
        employeeRepository.save(new Employee("Jaume", "123", "321", "Hi", "Pepe"));
    }
}
