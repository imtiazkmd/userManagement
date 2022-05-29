package com.employeemanagement.Management.daoImpl;

import com.employeemanagement.Management.dao.EmployeeDao;
import com.employeemanagement.Management.model.EmployeeModel;
import com.employeemanagement.Management.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public String saveEmployee(EmployeeModel employeeModel) {
        employeeRepo.se
        return null;
    }
}
