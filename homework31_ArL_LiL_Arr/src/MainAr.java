import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;

public class MainAr {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("ArraylyList:");
        ArrayList<Integer>arrList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            arrList.add(rand.nextInt(2));
            System.out.println(arrList);
        }
    }



}
