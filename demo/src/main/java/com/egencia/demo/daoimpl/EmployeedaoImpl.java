package com.egencia.demo.daoimpl;

import com.egencia.demo.dao.Employeedao;
import com.egencia.demo.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeedaoImpl implements Employeedao {

    @Autowired
   JdbcTemplate jdbcTemplate;

    @Override
    public EmployeeModel getEmployee(int id) {
        List<EmployeeModel> employeeList = getEmployees();
        for(EmployeeModel employeeModel:employeeList){
            if(employeeModel.getEmpId()==id){
                return employeeModel;
            }
        }

        return null;
    }

    @Override
    public String saveUser(EmployeeModel ee) {
       if(ee.geteNamee() != null){
           String insertQuery = "insert into employee(empid,ename,age,department,email) values(?,?,?,?,?)";
           jdbcTemplate.update(insertQuery,ee.getEmpId(),ee.geteNamee(),ee.geteAge(),ee.geteDepartment(),ee.getEmail());
           return "User saved successfully";
       }
       else {
           return "Name should not be empty!";
       }

      /* String insertQuery = "insert into employee(empid,ename,age,department,email) values(?,?,?,?,?)";
        jdbcTemplate.update(insertQuery,ee.getEmpId(),ee.geteNamee(),ee.geteAge(),ee.geteDepartment(),ee.getEmail());
*/
    }

    public List<EmployeeModel> getEmployees() {

        List<EmployeeModel> employeeModelList = new ArrayList<>();
        String sql = "select * from employee";
        jdbcTemplate.query(sql, (rs -> {
            EmployeeModel emp = new EmployeeModel();
            emp.setEmpId(rs.getInt("empId"));
            emp.seteNamee(rs.getString("ename"));
            emp.seteAge(rs.getInt("age"));
            emp.seteDepartment(rs.getInt("department"));
            emp.setEmail(rs.getString("email"));
            employeeModelList.add(emp);
        }));
        return employeeModelList;


       /* EmployeeModel e1 = new EmployeeModel();
        e1.seteNamee("Rajesh");
        e1.seteAge(24);
        e1.seteDepartment(123);
        e1.setEmail("rajesh@gmail.com");
        e1.setEmpId(1);

        EmployeeModel e2 = new EmployeeModel();
        e2.seteNamee("Vinod");
        e2.seteAge(25);
        e2.seteDepartment(124);
        e2.setEmail("vinod@gmail.com");
        e2.setEmpId(2);

        EmployeeModel e3 = new EmployeeModel();
        e3.seteNamee("Mohan");
        e3.seteAge(25);
        e3.seteDepartment(124);
        e3.setEmail("mohan@gmail.com");
        e3.setEmpId(3);

        EmployeeModel e4 = new EmployeeModel();
        e4.seteNamee("Kranthi");
        e4.seteAge(25);
        e4.seteDepartment(124);
        e4.setEmail("kranthi@gmail.com");
        e4.setEmpId(4);

        employeeModelList.add(e1);
        employeeModelList.add(e2);
        employeeModelList.add(e3);
        employeeModelList.add(e4);

        return  employeeModelList;*/

    }

}
