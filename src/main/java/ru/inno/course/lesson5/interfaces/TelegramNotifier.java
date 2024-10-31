package ru.inno.course.lesson5.interfaces;

import ru.inno.course.lesson5.justclasses.Human;

public class TelegramNotifier implements Notifier {
    public TelegramNotifier() {
    }

    public void notifyUser(Human human, String address) {
        System.out.println("Отправлено телеграм ботом на номер: " + human.getPhone());
        System.out.println("Ваш товар прибыл в пункт выдачи " + address);
    }
}
