import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        //Task A
        Student student1 = new Student();
        student1.name = "Mark";
        student1.age = 30;
        student1.id = "A100";
        student1.department = "Economics";
        student1.gpa = 4.0;

        Student student2 = new Student();
        student2.name = "Ann";
        student2.age = 31;
        student2.id = "A200";
        student2.department = "Economics";
        student2.gpa = 3.8;

        Student student3 = new Student();
        student3.name = "Andrew";
        student3.age = 29;
        student3.id = "A300";
        student3.department = "Political science";
        student3.gpa = 3.9;

        //System.out.printf("Student #1\nName: %s\nAge: %d\nID: %s\nDepartment: %s\nGPA: %.1f\n ",
         //       student1.name, student1.age, student1.id, student1.department, student1.gpa); - ВЫВЕЛАСЬ ОШИБКА, НЕ СМОГЛА ПОНЯТЬ ПОЧЕМУ. МОЖЕТЕ ОБЪЯСНИТЬ ГДЕ ТУТ ОШИБКА?

        System.out.println("STUDENT 1:" + "\nName: " + student1.name
                            + "\nAge: " + student1.age
                            + "\nID: " + student1.id
                            + "\nDepartment: " + student1.department
                            + "\nGPA: " + student1.gpa);

        System.out.println();
        System.out.println("STUDENT 2:" + "\nName: " + student2.name
                + "\nAge: " + student2.age
                + "\nID: " + student2.id
                + "\nDepartment: " + student2.department
                + "\nGPA: " + student2.gpa);

        System.out.println();
        System.out.println("STUDENT 3:" + "\nName: " + student3.name
                + "\nAge: " + student3.age
                + "\nID: " + student3.id
                + "\nDepartment: " + student3.department
                + "\nGPA: " + student3.gpa);

        //Task B
        House house1 = new House();
        house1.company = "Malina";
        house1.location = "Erkindik ave";
        house1.type = "Townhouse";
        house1.price = 10000;
        house1.purpose = "annual rent";

        House house2 = new House();
        house2.company = "Elite Stroy";
        house2.location = "Moskovskaya-Umetalieva";
        house2.type = "Cottage";
        house2.price = 70000;
        house2.purpose = "sale";

        House house3 = new House();
        house3.company = "Avangard";
        house3.location = "Ala Archa";
        house3.type = "Cottage";
        house3.price = 100000;
        house3.purpose = "sale";

        System.out.println();
        System.out.println("HOUSE 1: " + "\nCompany name: " + house1.company
                            + "\nLocation: " + house1.location
                            + "\nType: " + house1.type
                            + "\nPrice: " + house1.price
                            + "\nPurpose: " + house1.purpose);

        System.out.println();
        System.out.println("HOUSE 2: " + "\nCompany name: " + house2.company
                + "\nLocation: " + house2.location
                + "\nType: " + house2.type
                + "\nPrice: " + house2.price
                + "\nPurpose: " + house2.purpose);

        System.out.println();
        System.out.println("HOUSE 3: " + "\nCompany name: " + house3.company
                + "\nLocation: " + house3.location
                + "\nType: " + house3.type
                + "\nPrice: " + house3.price
                + "\nPurpose: " + house3.purpose);

    }

}
