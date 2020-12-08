package com.company;

public class Parrot {
    String name;
    String species;
    int age;

    public Parrot(){}

    public Parrot (String name, String species, int age){
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSpecies(String species){
        this.species = species;
    }
    public String getSpecies(){
        return species;
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



}

