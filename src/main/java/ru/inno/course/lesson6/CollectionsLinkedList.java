package ru.inno.course.lesson6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ru.inno.course.lesson5.justclasses.Human;

public class CollectionsLinkedList {

    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("banana");
        fruits.add(0, "banana");
        fruits.set(0,"nobanana");
        fruits.add(3, "kiwi");
        fruits.remove(1);
        fruits.remove("banana");
        fruits.remove("banana");
        System.out.println(fruits.size());
        System.out.println("Самый первый элемент: " + fruits.get(0));


        List<String> fruits2 = new LinkedList<>();
        fruits2.add("яблоко");
        fruits2.addAll(fruits);

        //System.out.println(fruits2);
        for (String fruit : fruits)
        {
            //System.out.println(fruit.toUpperCase());
            System.out.println(fruit);
        }

        List<Human> humans = new LinkedList<>();
        humans.add(new Human("John", 30));
        humans.add(new Human("Jack", 33));
        humans.add(new Human("Sam", 35));

        System.out.println(humans.get(0).getName());

        for (Human human : humans)
        {
            System.out.println(human.getName() + " " + human.getAge());
        }


    }
}
