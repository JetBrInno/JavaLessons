package ru.inno.course.lesson10.ClassesOOP;

import java.util.ArrayList;
import java.util.List;

public class Vk {

    public static void main(String[] args) {
        User user1 = new User("John", 1);
        User user2 = new User("User123", 2);
        User user3 = new User("UFO100300", 3);
        Admin admin = new Admin("Pavel123", 4, "fAKFOAKFOAKFOAFKOAFOKSAF");
        Moderator moderator = new Moderator("Moder4815", 5);
        admin.sendMessage("Привет!");
        admin.ban();

        moderator.sendAlert();
        moderator.sendMessage("Я модер, но я умею писать сообщения");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(admin);
        users.add(moderator);
        System.out.println(users.size());
    }
}
