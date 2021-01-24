import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
      String a = "\nВетер с моря дул";
      String b = "\nНагонял беду";
      String c = "\nИ сказал ты мне";
      String d = "\nБольше не приду";
      list.add(0, a);
      list.add(1, b);
      list.add(2, c);
      list.add(3, d);

      list.add(1, a);
      list.add(3, b);
      list.add(5, c);
      list.add(7, d);

        System.out.println(list);

        String simbolCount = a + a + b+ b+ c+ c+ d+ d;

      ArrayList<String> newList = new ArrayList<>();
        for(String s : list){
          if(s.length() >= 15) {
           newList.add(s);
            System.out.println(newList);
           }
        }
        newList.remove(2);
      System.out.println(newList);
// Task B
      List<Integer> num = new ArrayList<>();
      List<Integer> numEven = new ArrayList<>();
      List<Integer> numOdd = new ArrayList<>();
      Random rand = new Random();
      for (int i = 1; i < 50; i++){

        num.add(rand.nextInt(100));
        if(i % 2 == 0) {
          numEven.add(i);
          if (i % 2 != 0) {
            numOdd.add(i); // не смогла правильно указать :(. не знаю как записать нечетные в другой лист.

        }
        }
      }
      System.out.println("Even numbers: " + numEven);
      System.out.println("Odd numbers: " + numOdd);



    }
}
