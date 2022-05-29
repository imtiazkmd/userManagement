package com.egencia.demo.service;

import com.egencia.demo.dao.Employeedao;
import com.egencia.demo.daoimpl.EmployeedaoImpl;
import com.egencia.demo.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeedaoImpl empd;
    public EmployeeModel getEmployee(int emId) {
        EmployeeModel em = empd.getEmployee(emId);
        return em;
    }

    @Override
    public String getUser(EmployeeModel ee) {
        return empd.saveUser(ee);
    }

    @Override
    public List<EmployeeModel> getAllUsers() {
        return empd.getEmployees();
    }
}
