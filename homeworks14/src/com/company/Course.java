package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Course {

    String name;
    String date;
    String id;
    String nameOfProfessor;

    public Course(){}

    public Course(String name, String date, String id, String nameOfProfessor){
        this.name = name;
        this.date = date;
        this.id = id;
        this.nameOfProfessor = nameOfProfessor;
    }


    public void setName(String name){
        this.name = name;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setNameOfProfessor(String nameOfProfessor){
        this.nameOfProfessor = nameOfProfessor;
    }

    public String getName(){
        return name;
    }
    public String getDate(){
        return date;
    }
    public String getId(){
        return id;
    }
    public String getNameOfProfessor(){
        return nameOfProfessor;
    }

}

