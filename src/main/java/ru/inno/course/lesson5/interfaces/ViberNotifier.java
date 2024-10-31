package ru.inno.course.lesson5.interfaces;

import ru.inno.course.lesson5.justclasses.Human;

public class ViberNotifier implements Notifier {

    public void notifyUser(Human human, String address) {
        System.out.println("Вайбер: " + human.getPhone());
        System.out.println("Ваш товар прибыл в пункт выдачи " + address);
    }
}
