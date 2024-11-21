package ru.inno.course.lesson10.ArraysDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArraysDemo {

    public static void main(String[] args) {
        Item iphone = new Item("Iphone", 1000, 80);
        Item samsung = new Item("Samsung", 800, 85);
        Item redmi = new Item("Redmi", 900, 70);

        List<Item> items = new ArrayList<>();
        items.add(iphone);
        items.add(samsung);
        items.add(redmi);

        System.out.println(items);
        items.sort((o1, o2) -> {
            System.out.println(o1.name() + " " + o2.name());
            return o1.price() - o2.price();
        }); // по возрастанию
        items.sort(Comparator.comparingInt(Item::price)); // по возрастанию то же самое
        System.out.println(items.get(0).name());
        System.out.println(items);
    }
}
