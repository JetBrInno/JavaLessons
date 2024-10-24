package ru.inno.course.lesson3;

public class ObjectsInArray {

    public static void main(String[] args) {
        Smartphone[] shop = new Smartphone[2];
        shop[0] = new Smartphone("iPhone", "15", "300x200");
        shop[1] = new Smartphone("iPhone", "15 Pro", "400x200");

        for (int i = 0; i < shop.length; i = i + 1) // создай переменную i. Пока она меньше 5 - увеличивай ее на 1.
        {
            System.out.println(shop[i].brand + " " + shop[i].model + " " + shop[i].screen);
        }
        System.out.println("Выполнится 1 раз");
//        int i = 0;
//        System.out.println(shop[i].brand + " " + shop[i].model + " " + shop[i].screen);
//
//        i = i + 1; // 1
//        System.out.println(shop[i].brand + " " + shop[i].model + " " + shop[i].screen);
//
//        i = i + 1; // 2
//        System.out.println(shop[i].brand + " " + shop[i].model + " " + shop[i].screen);
//
//        i = i + 1; // 3
//        System.out.println(shop[i].brand + " " + shop[i].model + " " + shop[i].screen);
//
//        i = i + 1; // 4
//        System.out.println(shop[i].brand + " " + shop[i].model + " " + shop[i].screen);
    }
}
