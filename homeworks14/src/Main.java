import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Task B
        Student student1 = new Student("1981.11.14", "Joe", "Ann", 'F', 39);
        Student student2 = new Student("1983.05.30","Smith", "Maks", 'M', 37);
        Student student3 = new Student("1983.07.02", "Hopkins", "Antony", 'M', 37);

        Student[] student = new Student[3];
        student[0] = student1;
        student[1] = student2;
        student[2] = student3;

        Group group = new Group(student, "JAVA", "2020.09.15", 10);

        Course course = new Course ("JAVA", "2020.05.10", "JV-F20", "Temirbekova Sabina");

        System.out.println("Students: ");
        for (int i = 0; i < group.getStudent().length; i++){
            System.out.println("Surname: " + group.getStudent()[i].getSurname()
                    + ", Name: " + group.getStudent()[i].getName()
                    + ", Date of Birth: " + group.getStudent()[i].getDateBirth()
                    +  ", Age: " + group.getStudent()[i].getAge());
        }
        System.out.println();
        System.out.println("Course information:");
        System.out.println("Course name: " + course.getName() + ", Creation date: " + course.getDate() + ", ID: " + course.getId() + ", Name of professor: " + course.getNameOfProfessor());
        System.out.println();
        System.out.println("Group information:");
        System.out.println("Date of start: " + group.getStartDate() + "Study duration in months: " + group.getDuration());



        //Task A

        Parrot parrot1 = new Parrot("Roma", "Scarlet macaw", 1);
        Parrot parrot2 = new Parrot ("Berry", "Cuban amazons", 2);
        Parrot parrot3 = new Parrot ("Perru", "Dusky-headed parakeets", 1);

        Parrot[] parrot = new Parrot[3];
        parrot[0] = parrot1;
        parrot[1] = parrot2;
        parrot[2] = parrot3;

        Dog dog1 = new Dog("Rex", "Preobrajenski Philip", 3, "vaccinated");
        Dog dog2 = new Dog("Markiza", "Olga Petrova", 4, "not vaccinated");
        Dog dog3 = new Dog("Fox", "Andrew Parker", 3, "vaccinated");

        Dog[] dog = new Dog[3];
        dog[0] = dog1;
        dog[1] = dog2;
        dog[2] = dog3;

        Cat cat1 = new Cat("Kisa", 4, "Harry Potter");
        Cat cat2 = new Cat("Maks", 2, "Jacob Obolsky");

        Cat[] cat = new Cat[2];
        cat[0] = cat1;
        cat[1] = cat2;

        Fish fish1 = new Fish("Zlata", "orange", 2);
        Fish fish2 = new Fish("Avrora", "black with white spots", 3);
        Fish fish3 = new Fish("Neptun", "red", 1);

        Fish[] fish = new Fish[3];
        fish[0] = fish1;
        fish[1] = fish2;
        fish[2] = fish3;

        System.out.println();
        System.out.println("Parrots:");
        for (int p = 0; p < parrot.length; p++){
            System.out.println("Name: " + parrot[p].getName() + ", Species: " + parrot[p].getSpecies() + ", Age: " + parrot[p].getAge());
        }

        System.out.println();
        System.out.println("Dogs:");
        for (int d = 0; d < dog.length; d++){
            System.out.println("Name: " + dog[d].getName() + ", Owner: " + dog[d].getOwner() + ", Age: " + dog[d].getAge() + ", Status of vaccination: " + dog[d].getVaccineStatus());
        }

        System.out.println();
        System.out.println("Cats:");
        for (int c = 0; c < cat.length; c++){
            System.out.println("Name: " + cat[c].getName() + ", Age: " + cat[c].getAge() + ", Owner: " + cat[c].getOwner());
        }

        System.out.println();
        System.out.println("Fish:");
        for (int f = 0; f < fish.length; f++){
            System.out.println("Name: " + fish[f].getName() + ", Color: " + fish[f].getColor() + ", Age: " + fish[f].getAge());
        }
    }
}

