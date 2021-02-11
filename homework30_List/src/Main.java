import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[5];
        Random rand = new Random();
        LinkedList<Integer> list = new LinkedList<>();
       // ArrayList<Integer> sort = new ArrayList<>();

        System.out.println("Array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(2);
            list.add(rand.nextInt(2));
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }

          System.out.println("**********");

       int[] newArray = sort(a);
       for(int i = 0; i <newArray.length; i++){
           System.out.printf("a[%d] = %d\n", i, a[i]);
      }


        System.out.println();
       System.out.println("LinkedList:");
        System.out.println(list);

        list = sort(list);
        System.out.println(list);

    }
    //Array
    public static int[] sort(int[] a){
    for(int i = 0; i < a.length; i++){
        for(int j = 0; j < a.length - i - 1; j++){
          int nextIndex = j + 1;
            if(a[j] > a[nextIndex]){
                int t = a[j];
                a[j] = a[nextIndex];
                a[nextIndex] = t;
            }
        }
    }
    return a;
    }

    //ArrayList
    public static ArrayList<Integer>sort(ArrayList<Integer> list){
   ArrayList<Integer>resultArrList = new ArrayList<>();

    int t = list.get(0);
    list.set(0, list.get(1));
    list.set(1, t);
        for(Integer I = 0; I < resultArrList.size(); I++){
            for(Integer J = 0; J < resultArrList.size() - I - 1; J++){
                Integer nextIndex = J + 1;
                if(resultArrList[J] > resultArrList[nextIndex]){
                    int t = a[j];
                    a[j] = a[nextIndex];
                    a[nextIndex] = t;
                }
            }
        }
    return null;
    }
    //LinkedList
    public static LinkedList<Integer> sort(LinkedList<Integer> list) {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer number : list) {
         if(number == 0){
             result.addFirst(number);
         } else if (number ==1) {
             result.addLast(number);
         }
        }
        return result;
    }
}

