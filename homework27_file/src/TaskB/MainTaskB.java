package TaskB;

import java.io.FileWriter;
import java.io.IOException;

public class MainTaskB {
    private static Object SongB;

    public static void main(String[] args) throws IOException {
       /*
        SongB songB = new SongB ("It's my life", "Bon Jovi",
                "This ain't a song for the broken-hearted\n" +
                        "No silent prayer for faith-departed\n" +
                        "And I ain't gonna be just a face in the crowd\n" +
                        "You're gonna hear my voice when I shout it out loud\n" +
                        "It's my life\n" +
                        "It's now or never\n" +
                        "But I ain't gonna live forever\n" +
                        "I just want to live while I'm alive\n" +
                        "My heart is like an open highway\n" +
                        "Like Frankie said, \"I did it my way\"\n" +
                        "I just want to live while I'm alive",
                "rock");

        */

        FileWriter fileWriter = new FileWriter("itsMyLife.txt");
        fileWriter.write("It's my life" + "\nBon Jovi" + "\nThis ain't a song for the broken-hearted\n" +
                "No silent prayer for faith-departed\n" +
                "And I ain't gonna be just a face in the crowd\n" +
                "You're gonna hear my voice when I shout it out loud\n" +
                "It's my life\n" +
                "It's now or never\n" +
                "But I ain't gonna live forever\n" +
                "I just want to live while I'm alive\n" +
                "My heart is like an open highway\n" +
                "Like Frankie said, \"I did it my way\"\n" +
                "\nI just want to live while I'm alive\n...." + "\nrock" );

        fileWriter.close();



    }
}
