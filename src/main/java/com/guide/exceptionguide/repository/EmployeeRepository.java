package com.guide.exceptionguide.repository;

import com.guide.exceptionguide.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
