package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> listPersonas = new ArrayList<>();

        listPersonas.add(new Person("Maria", "Rodriguez"));
        listPersonas.add(new Teacher("Alejandro", "Sainz","Educación"));
        listPersonas.add(new PoliceOfficer("David", "Fernandez","B-99"));
        listPersonas.add(new Doctor("Oscar", "Torres", "Nefrología e infectología"));


        return listPersonas;
    }

    public static void showPeopleDetails(List<Person> stringList) {

        for (Person p : stringList){
            p.getDetails();
        }

    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
