package com.uet.int2204.Week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week11 {

    public static <T extends Comparable> List<T> sortGeneric(List<T> arr) {
        List<T> list = new ArrayList<>(arr);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(-1);
        integerList.add(100);
        integerList.add(96);
        integerList.add(33);
        integerList = Week11.sortGeneric(integerList);
        for (int x : integerList)
            System.out.println(x);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Nguyen A", 22, "ABC"));
        personList.add(new Person("Nguyen A", 20, "DEF"));
        personList.add(new Person("Le B", 30, "GHI"));
        personList = Week11.sortGeneric(personList);
        for (Person person : personList)
            System.out.println(person.getAddress());
    }
}
