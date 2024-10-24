package ru.inno.course.lesson2;

public class MyVk {

    public static void main(String[] args) {

        int x = 10;
        Human human = new Human("Борис",12, "+79252352","abc@ya.ru",4.5);
        System.out.println("Сколько ему лет? - " + human.age);
        human.age = 50;
        System.out.println("Сколько ему лет? - " + human.age);
        System.out.println("Как его зовут? - " + human.name);


//        Human human2 = new Human("Ура!");
//        human2.age = 50;
//        human2.name = "Михаил";
//        human2.phone = "+78532543534";
//        human2.email = "abc@ya.ru";
//        human2.rating = 5.0;
//        System.out.println(human2.age + human2.name + human2.phone + human2.email + human2.rating);

        Smartphone iphone = new Smartphone();
        iphone.brand = "iPhone";
        iphone.model = "15";
        iphone.coreNumbers = 8;
        iphone.capacity = 3300;
        iphone.screen = "1179 x 2556 пикселей";
        System.out.println(iphone.brand);
    }
}
