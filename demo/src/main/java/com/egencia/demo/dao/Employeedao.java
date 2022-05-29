package com.egencia.demo.dao;

import com.egencia.demo.model.EmployeeModel;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface Employeedao {
    EmployeeModel getEmployee(int id);
    String saveUser(EmployeeModel ee);

    List<EmployeeModel> getEmployees();


}
