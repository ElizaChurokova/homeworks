package people;

import java.time.LocalDate;

public class Professor extends Person{
    private String speciality;

    public Professor(){}

    public Professor(LocalDate dateBirth, String surname, String name, char gender, int age, String speciality) {
        super(dateBirth, surname, name, gender, age);
        this.speciality = speciality;
    }
    @Override
    public String toString(){
        String message = "My name is " + getName() + ". I teach " + this.speciality + ".";
        return message;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
