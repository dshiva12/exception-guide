package com.guide.exceptionguide.service;

import com.guide.exceptionguide.repository.EmployeeRepository;
import com.guide.exceptionguide.domain.Employee;
import com.guide.exceptionguide.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> getEmployees() {
        List <Employee> employeeList=repository.findAll();
        if(employeeList.isEmpty() || employeeList.size()==0)
            throw new BusinessException("No Employees found in table.");
        return employeeList;
    }
}
