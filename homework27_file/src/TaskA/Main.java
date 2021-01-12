package TaskA;

import TaskA.Song;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Object Song;

    public static void main(String[] args) {

        /*
    TaskA.Song song = new Song("Just give me a reason",
            "Pink",
            "Right from the start\n" +
                    "You were a thief, you stole my heart\n" +
                    "And I, your willing victim\n" +
                    "I let you see the parts of me, that weren't all that pretty\n" +
                    "And with every touch you fixed them\n" +
                    "Now you've been talking in your sleep oh oh\n" +
                    "Things you never say to me oh oh\n" +
                    "Tell me that you've had enough\n" +
                    "Of our love, our love\n" + "...",
            "Pop");

        System.out.println(song.toString());
*/

        try {
            FileReader fr = new FileReader("file.txt");
            Scanner scn = new Scanner(fr);

            while (scn.hasNextLine()) {
                System.out.println(scn.nextLine());
            }
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("There is no file!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
