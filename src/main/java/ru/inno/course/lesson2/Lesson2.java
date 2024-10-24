package ru.inno.course.lesson2;

public class Lesson2 {

    public static void main(String[] args) {

        String url = "http://ya.ru"; // https
        boolean isStarted = url.startsWith("https"); // начинается с  - true false
        System.out.println("Сайт 'Яндекс' безопасен \\? " + isStarted);

//        int x = 5;
//        String name = "http://ya.ru"; // https
//        boolean isStarted = name.startsWith("https"); // начинается с  - true false
//        //System.out.println(isStarted);
//
//
//        name = "Борис"; //  Б - 0. о - 1. р - 2. и - 3. с - 4.
//        //name = name.replace("Бо", "б");
//
//        String subName = name.substring(2);
//        System.out.println(name);
//        System.out.println(subName);

        int passport = 528;

        String stringPassport = "0528";

        String number = "+79246734227";
        System.out.println(number);

        String human = "Борис Борисов Борисович 10.02.1992 Москва Мужчина Каштановый";
        System.out.println(human);
    }
}
