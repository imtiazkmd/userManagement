package com.egencia.demo.jsonFormat;

import java.util.List;

public class User {
    int userId;
    int conceptId;
    int longId;
    String firstName;
    String lname;
    String isDeleteFlag;
    List<Roles> roles;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getConceptId() {
        return conceptId;
    }

    public void setConceptId(int conceptId) {
        this.conceptId = conceptId;
    }

    public int getLongId() {
        return longId;
    }

    public void setLongId(int longId) {
        this.longId = longId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getIsDeleteFlag() {
        return isDeleteFlag;
    }

    public void setIsDeleteFlag(String isDeleteFlag) {
        this.isDeleteFlag = isDeleteFlag;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }
}
