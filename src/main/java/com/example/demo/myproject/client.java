package com.example.demo.myproject;//package name needs to be same name with maven project

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;


    public client(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

     public String getName(){
        return this.name;
    }

    public void setName(String name){
       this.name = name;
    }

     public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
       this.surname = surname;
    }

    @Override
    public String toString(){
        return "Client{" + 
            "id=" + id +
            ", name = " + name + '\'' +
            ", age = " + surname + '\'' +
            '}';
    }
}
