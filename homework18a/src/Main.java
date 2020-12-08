import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        //Task B
        LocalDate localDate = LocalDate.of(1981, 11, 14);
        LocalDate localDate1 = LocalDate.of(1994, 2,3);
        LocalDate localDate2 = LocalDate.of(1992, 5,7);
        Student student1 = new Student(localDate, "Joe", "Ann", 'F', 39, "Tennis");
        Student student2 = new Student(localDate1,"Smith", "Maks", 'M', 37, "Piano");
        Student student3 = new Student(localDate2, "Hopkins", "Antony", 'M', 37, "Chess");

        System.out.println(student1);

        Student[] student = new Student[3];
        student[0] = student1;
        student[1] = student2;
        student[2] = student3;

        Group group = new Group(student, "JAVA", "2020.09.15", 10);
        System.out.println(group);
        Course course = new Course ("JAVA", "2020.05.10", "JV-F20", "Temirbekova Sabina");
        System.out.println(course);

       /* System.out.println("Students: ");
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
*/




        //HW17. Due to 2.12.2020. toString

        // LocalDate localDate = localDate.(int year; int month; int date);
        //LocalTime startTime = localTime.no

        LocalDate localDate3 = LocalDate.of(2020, 12, 3);
        LocalTime localTime = LocalTime.of(20, 30);
        boolean taskGiven = false;
        boolean examDone = false;

        Lesson lesson = new Lesson(localDate3, student,  localTime, true, false);
        System.out.println(lesson);

        LocalDate localDate4 = LocalDate.of(1878, 1,2);

        Professor professor = new Professor(localDate4, "Bond", "James", 'M', 41, "JAVA");
        System.out.println(professor);




    }
}

