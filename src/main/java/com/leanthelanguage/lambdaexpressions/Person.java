package com.leanthelanguage.lambdaexpressions;

import java.time.LocalDate;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class Person {


    public enum Sex {
        MALE, FEMALE;
    }


    private String name;
    private LocalDate birthDay;
    private Sex gender;
    private String mail;

    public Person(String name,
                  LocalDate birthDay,
                  Sex gender,
                  String mail) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public Sex getGender() {
        return gender;
    }

    public String getMail() {
        return mail;
    }


    public void printPerson(){
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", gender=" + gender +
                ", mail='" + mail + '\'' +
                '}';
    }



}
