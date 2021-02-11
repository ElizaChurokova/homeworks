import com.company.Database;

public class Main {

    public static void main(String[] args) {
        System.out.println(Database.getTrainersCount());
        System.out.println("Students with a letter: " + Datatbase.getAstudent);

        // lesson
        Database.insertCountry(1, "Kyrgyz republic", 995, 6000000, 70000);
///...


        Database.insertCity(1, "Bishkek", 1, 1500000);
        Database.insertCity(2, "Washington", 2, 705000);
        Database.insertCity(3, "Moscow", 3, 13000000);
        Database.insertCity(4, "Beijing", 4, 23000000);
        Database.insertCity(5, "London", 5, 9000000);



    }
}
