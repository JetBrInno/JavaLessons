package ru.inno.course.lesson10.ArraysDemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Alex", 5);
        students.put("John",2);
        students.put("Michael", 3);

        for (Map.Entry entry: students.entrySet())
        {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

       // System.out.println(students.keySet().stream().sorted(Comparator.reverseOrder()).toList());
        System.out.println(students.values().stream().sorted(Comparator.naturalOrder()).toList());

    }
}
