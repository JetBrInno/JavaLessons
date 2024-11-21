package ru.inno.course.lesson5.interfaces;


import java.util.Scanner;
import ru.inno.course.lesson5.justclasses.Human;

public class Shop {

    public static void main(String[] args) {
        Human jack = new Human("Jack", 25, "8986364363", "Jack@mail.ru", 10.0);
        Human alex = new Human("Alex", 33, "8423562663", "Alex@mail.ru", 8.6);
        Human john = new Human("John", 45, "87474363", "John@mail.ru", 9.0);

        System.out.println("Куда вам отправлять уведомления? СМС/EMAIL/ТЕЛЕГА/VIBER");
        String typeOfNotifier = new Scanner(System.in).nextLine();

        Notifier notifier;
        if (typeOfNotifier.equals("СМС")) {
            notifier = new SmsNotifier();
        } else if (typeOfNotifier.equals("EMAIL")) {
            notifier = new EmailNotifier();
        } else if (typeOfNotifier.equals("VIBER")) {
            notifier = new ViberNotifier();
        } else if (typeOfNotifier.equals("TELEGRAM")) {
            notifier = new TelegramNotifier();
        }
        else {
            notifier = new WhatsappNotifier();
        }

        notifier.notifyUser(jack, "г. Москва");
        notifier.notifyUser(alex, "г. Москва");
        notifier.notifyUser(john, "г. Москва");
    }
}
