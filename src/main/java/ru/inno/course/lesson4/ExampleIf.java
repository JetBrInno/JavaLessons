package ru.inno.course.lesson4;

import java.util.Scanner;

public class ExampleIf {

    public static void main(String[] args) {
        int x = 5;

//        System.out.println(10 > 5);
//        System.out.println(10 < 5);
//        System.out.println(10 == 10);
//        System.out.println(5 >= 5);

//        String url = "https://vk.ru";
//
//        if (url.startsWith("https"))
//        {
//            System.out.println("Защищенное соединение");
//        }
//        else {
//            System.out.println("Незащищенное соединение");
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите промокод: ");
        String promoCode = scanner.nextLine();

        if (promoCode.equals("cyber-monday")) {
            System.out.println("Поздравляю, ваша скидка составила 50%");
        } else if (promoCode.equals("black-friday")) {
            System.out.println("Поздравляю, ваша скидка составила 99%");
        } else if (promoCode.equals("super-sale")) {
            System.out.println("Поздравляю, ваша скидка составила 80%");
        } else {
            System.out.println("Промокод не найден");
        }


    }

}
