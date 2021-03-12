package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       // System.out.println(Database.get);

 //       HashMap<String, String> hashMap = new HashMap<>();
        Map<String, String> hashMap = new HashMap<>();
        List<String> pens = new ArrayList<>();
        hashMap.put("president", "Eltsin");
        pens.add(hashMap.put("president", "Putin"));
        System.out.println(hashMap);
        System.out.println(pens);

        hashMap.put("minister", "Mishustin");
        hashMap.put("mayor", "Sobyanin");
        Set<String> keys = hashMap.keySet();
        System.out.println(hashMap);
        System.out.println(keys);
        System.out.println("______");
        keys.remove("mayor");
        System.out.println(hashMap);
        System.out.println(keys);
       // keys.add("singer"); так делать нельзя
        System.out.println(keys);

        Collection<String> values = hashMap.values();
        values.remove("Mishustin");
        System.out.println(hashMap);
        System.out.println(values);
       // values.add("Mishustin"); можем удалять, считывать, но не можем добавлять, также как и в keys
        System.out.println(values);
        System.out.println("*********");
        Map<TestClass, Integer> hashs = new HashMap<>();
        //TestClass t1 = new TestClass(1); nado proslushat 1^48 minut
        
        //TestClass t2 = new TestClass(2);




    }
}
/*
class TestClass{
    int t;
    public t (){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return t == testClass.t;
    }

    @Override
    public int hashCode() {
        return Objects.hash(t);
    }

   }
 */


