package com.egencia.demo.service;

import com.egencia.demo.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    EmployeeModel getEmployee(int emId);
    String getUser(EmployeeModel ee);
    List<EmployeeModel> getAllUsers();

}
