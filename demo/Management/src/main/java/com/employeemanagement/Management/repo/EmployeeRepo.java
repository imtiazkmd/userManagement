package com.employeemanagement.Management.repo;

import com.employeemanagement.Management.entity.EmployeeEntity;
import com.employeemanagement.Management.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

    String saveEmployee(EmployeeModel employeeModel);
}
