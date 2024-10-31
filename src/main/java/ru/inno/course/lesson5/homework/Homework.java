package ru.inno.course.lesson5.homework;

public class Homework {


    public static void main(String[] args) {
        Card card = new Card("1111 2222 4444 2229", "1234");
        System.out.println(card.getNumber());
        System.out.println(card.getNumber("1234"));
    }
}
