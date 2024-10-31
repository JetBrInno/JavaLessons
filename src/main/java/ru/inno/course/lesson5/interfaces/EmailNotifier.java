package ru.inno.course.lesson5.interfaces;

import ru.inno.course.lesson5.justclasses.Human;

public class EmailNotifier implements Notifier {
    public EmailNotifier() {
    }

    public void notifyUser(Human human, String address) {
        System.out.println(human.getEmail());
        System.out.println("Ваш товар прибыл в пункт выдачи " + address);
    }
}
