package people;

import java.time.LocalDate;

public class Person {
    private LocalDate dateBirth;
    private String surname;
    private String name;
    private char gender;
    private int age;

    public Person(){}

    public Person(LocalDate dateBirth, String surname, String name, char gender, int age) {
        this.dateBirth = dateBirth;
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

