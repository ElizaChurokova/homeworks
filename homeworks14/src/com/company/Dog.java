package com.company;

public class Dog {
    String name;
    String owner;
    int age;
    String vaccineStatus; // vaccinated or not

    public Dog(){}

    public Dog (String name, String owner, int age, String vaccineStatus) {
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.vaccineStatus = vaccineStatus;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setOwner (String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }

    public void setAge(int age){
        if(age <= 0){
            System.out.println("Age can't be less than 0");
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setVaccineStatus(String vaccineStatus){
        this.vaccineStatus = vaccineStatus;
    }
    public String getVaccineStatus(){
        return vaccineStatus;
    }


}

