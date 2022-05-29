package com.egencia.demo.jsonFormat;

import java.util.List;

public class Roles {
    int roleId;
    String roleName;
    List<Concepts> concepts;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Concepts> getConcepts() {
        return concepts;
    }

    public void setConcepts(List<Concepts> concepts) {
        this.concepts = concepts;
    }
}
