import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Andrew");
        Student student2 = new Student("Altay");
        Student student3 = new Student("Shirin");
        Student student4 = new Student("Liza");
        Student student5 = new Student("Ann");

        Student[] students = new Student[5];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;

        try {
            FileReader fileReader = new FileReader("src/Main.java");
            Scanner scn = new Scanner(fileReader);
            File file = new File("output.txt");
            File file2 = new File("outputTwo.txt"); // ФАЙЛ БЕЗ ПРОБЕЛОВ
            FileWriter fileWriter = new FileWriter("output.txt");
            FileWriter fileWriter2 = new FileWriter(file2);

            while (scn.hasNextLine()) {
                String str = scn.nextLine();
                String str2 = str.replaceAll("\\s", "");
                System.out.println(str);
                fileWriter.write(scn.nextLine());
                fileWriter2.write(str2);

                if (file.length() > 100) {
                    throw new IllegalStateException();
                }
                if (file2.length() > 100) {
                    throw new IllegalStateException();
                }
            }
            fileReader.close();
            fileWriter.close();
            fileWriter2.close();

        } catch (FileNotFoundException e) {
            System.out.println("File is not unavailable");
        } catch (IllegalStateException e) {
            System.out.println("The code is too big");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        File output = new File("output.txt");
        System.out.println(output.length());
       //File output2 = new File("outputTwo.txt");
        //System.out.println(output2.length());     ХОЧУ УЗНАТЬ ДЛИНУ СТРОКИ ФАЙЛА 2. НО КОГДА ТАК ДЕЛАЮ, ТО СОДЕРЖИМОЕ ФАЙЛА ИСЧЕЗАЕТ И ОШИБКУ ВЫДАЕТ. ПОЧЕМУ?
    }
}
