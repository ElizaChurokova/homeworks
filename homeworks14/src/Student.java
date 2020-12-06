import java.time.LocalDate;

public class Student {

    String dateBirth;
    String surname;
    String name;
    char gender;
    int age;

    public Student(){}

    public Student(String dateBirth, String surname, String name, char gender, int age){
        this.dateBirth = dateBirth;
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString(){
        String message = "My name is " + this.name + ". I am " + this.age + " years old. ";
        return message;
    }

    public void setDateBirth(String dateBirth){
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

    public String getDateBirth(){
        return dateBirth;
    }
    public String getSurname(){
        return surname;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }



}

