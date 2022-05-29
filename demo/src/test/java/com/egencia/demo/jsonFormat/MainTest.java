package com.egencia.demo.jsonFormat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.util.*;

public class MainTest {
    public static void main(String[] args) throws JsonProcessingException {
        Concepts cp = new Concepts();
        cp.setConceptId(12);
        cp.setConceptName("Administrator");
        List<Concepts> lc = new ArrayList<>();
        lc.add(cp);

        Roles r1 = new Roles();
        r1.setRoleId(21);
        r1.setRoleName("Admin");
        r1.setConcepts(lc);

        Roles r2 = new Roles();
        r2.setRoleId(22);
        r2.setRoleName("Admin");
        r2.setConcepts(lc);

        Roles r3 = new Roles();
        r3.setRoleId(23);
        r3.setRoleName("Admin");
        r3.setConcepts(lc);

        List<Roles> lr = new ArrayList<>();
        lr.add(r1);
        lr.add(r2);
        lr.add(r3);

        for(Roles r : lr){
            Map<Integer,Roles> roles = new HashMap<>();
            roles.put(r.getRoleId(),r);
            Map<Integer,List<Concepts>> con = new HashMap<>();
            con.put(r.getRoleId(),r.getConcepts());

        }


        User us = new User();
        us.setConceptId(34);
        us.setFirstName("Md");
        us.setLname("Name");
        us.setRoles(lr);
        us.setIsDeleteFlag("Yes");
        us.setUserId(56);
        us.setLongId(78);

        List<User> ul = new ArrayList<>();
        ul.add(us);

        Title tl = new Title();
        tl.setStatus(200);
        tl.setTitle("user Loaded succesfully!");
        tl.setUsers(ul);

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String st = ow.writeValueAsString(tl);
        System.out.println(st);



    }
}
