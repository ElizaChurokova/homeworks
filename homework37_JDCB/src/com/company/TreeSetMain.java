package com.company;

import java.util.Set;


public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> set = new java.util.TreeSet<Integer>();
        set.add(5);
        set.add(50);
        set.add(1);
        set.add(2);
        System.out.println(set);

        Set<String> months = new java.util.TreeSet<>();
        months.add("january");
        months.add("february");
        months.add("march");
        months.add("april");
        System.out.println(months.contains("march"));
        months.remove("february");
        System.out.println(months.stream().findFirst());


        Set<String> setStr = new java.util.TreeSet<>();
        setStr.add("zone");
        setStr.add("apple");
        setStr.add("object");
        setStr.add("5");
        System.out.println(setStr);
    }

    private void add(int i) {
    }

}
