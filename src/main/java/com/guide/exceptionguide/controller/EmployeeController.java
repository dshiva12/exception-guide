package com.guide.exceptionguide.controller;

import com.guide.exceptionguide.domain.Employee;
import com.guide.exceptionguide.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/test")
    public String test(){
        return  "working";
    }

    @GetMapping("/employee")
    public ResponseEntity<Employee> getEmployee() {
        return new ResponseEntity(service.getEmployees(), HttpStatus.OK);

    }
}
