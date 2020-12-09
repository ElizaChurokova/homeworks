package people;

import java.time.LocalDate;

public class Student extends Person{

    private String club;

    public Student(){}

    public Student(LocalDate dateBirth, String surname, String name, char gender, int age, String club) {
        super(dateBirth, surname, name, gender, age);
        this.club = club;
    }


    @Override
    public String toString(){
        String message = "My name is " + getName() + ". I am " + getAge() + " years old. ";
        return message;
    }

    public void setDateBirth(LocalDate dateBirth){
        this.dateBirth = dateBirth;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setAge(int age){
        if (age <= 0){
            System.out.println("Age can't be less than 0");
            return;
        }
        this.age = age;
    }

    public LocalDate getDateBirth(){
        return getDateBirth();
    }
    public String getSurname(){
        return getSurname();
    }
    public String getName(){
        return getName();
    }
    public char getGender(){
        return getGender();
    }
    public int getAge(){
        return getAge();
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}

