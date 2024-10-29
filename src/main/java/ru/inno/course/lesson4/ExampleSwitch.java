package ru.inno.course.lesson4;

import java.util.Scanner;

public class ExampleSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите промокод: ");
        String promoCode = scanner.nextLine();

        switch (promoCode) {
            case "cyber-monday": // аналог ифа
                System.out.println("Поздравляю, ваша скидка составила 50%");
                break;
            case "black-friday":
                System.out.println("Поздравляю, ваша скидка составила 99%");
                break;
            case "super-sale":
                System.out.println("Поздравляю, ваша скидка составила 80%");
                break;
            default: // по сути аналог else
                System.out.println("Промокод не найден");
        }


    }
}
