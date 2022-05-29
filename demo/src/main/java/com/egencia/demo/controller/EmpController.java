package com.egencia.demo.controller;

import com.egencia.demo.model.EmployeeModel;
import com.egencia.demo.service.EmployeeService;
import com.egencia.demo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmployeeServiceImpl empsrv;

    @GetMapping("getUser")
    public EmployeeModel getEmployee(@RequestHeader  String id){
        EmployeeModel em = empsrv.getEmployee(Integer.parseInt(id));
        if(em != null){
            return em;
        }else{
            em = new EmployeeModel();
        }
        return em;
    }
    @PostMapping("userRegester")
    public String createUser(@RequestBody EmployeeModel em){
        return empsrv.getUser(em);
    }

    @GetMapping("getAllUsers")
    public List<EmployeeModel> getUsers(){
        return empsrv.getAllUsers();
    }

}
