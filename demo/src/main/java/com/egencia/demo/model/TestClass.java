package com.egencia.demo.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestClass {
    public static void main(String[] args) throws JsonProcessingException {
       /* Map<String, String> countries = new HashMap<String, String>();
        countries.put("Name","Uday");
        countries.put("Dob","2000");
        countries.put("Country","India");
        countries.put("State","Andhra Pradesh");
        countries.put("Region","Amalapuram");*/
        List<String> languages = new ArrayList<>();
        languages.add("Telugu");
        languages.add("Hindi");
        languages.add("Kannada");
        languages.add("Tamil");
        Map<String, List<String>> countries = new HashMap<String, List<String>>();
        countries.put("GroupOfLang",languages);
        Map<String,String> lang = new HashMap<>();
        lang.put("1","Hindi");
        lang.put("2","Tamil");
        lang.put("3","Telugu");

        Address ad = new Address();
        ad.setCountry("India");
        ad.setState("AP");
        ad.setRegion("Kurnool");
        ad.setLanguage(lang);

        Address add = new Address();
        add.setCountry("Katmandu");
        add.setState("Air");
        add.setRegion("CityName");
        add.setLanguage(lang);

        List<Address> listAd = new ArrayList<>();
        listAd.add(ad);
        listAd.add(add);

        UserModel um = new UserModel();
        um.setName("Vijay");
        um.setAge(23);
        um.setAddresses(listAd);


        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String st = ow.writeValueAsString(um);
        System.out.println(st);
    }
}
