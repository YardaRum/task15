package com.evo.task15.dto;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String firstname;
    private String surname;
    private String lastname;
    private LocalDate birthday;

    public Person() {
    }

    public Person(String firstname, LocalDate birthday, String lastname, String surname) {
        this.firstname = firstname;
        this.birthday = birthday;
        this.lastname = lastname;
        this.surname = surname;
    }

    public Person(int id, String firstname, String surname, String lastname, LocalDate birthday) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}

