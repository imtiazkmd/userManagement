package com.egencia.demo.model;

public class EmployeeModel {

    private int empId;
    private String eNamee;
    private int eAge;
    private int eDepartment;
    private String email;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String geteNamee() {
        return eNamee;
    }

    public void seteNamee(String eNamee) {
        this.eNamee = eNamee;
    }

    public int geteAge() {
        return eAge;
    }

    public void seteAge(int eAge) {
        this.eAge = eAge;
    }

    public int geteDepartment() {
        return eDepartment;
    }

    public void seteDepartment(int eDepartment) {
        this.eDepartment = eDepartment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
