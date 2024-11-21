package ru.inno.course.lesson10.ClassesOOP;

import java.util.ArrayList;
import java.util.List;

public class Vk {

    public static void main(String[] args) {
        User user1 = new User("John", 1);
        User user2 = new User("User123", 2);
        User moderator = new Moderator("Moder4815", 5);
        //moderator.sendAlert();
//        moderator.sendMessage("Я модер, но я умею писать сообщения");
//
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(moderator);
        System.out.println(users.size());
        user1.sendMessage("Привет! я юзер");
        moderator.sendMessage("Привет! я модератор");
       // user1.unBanMePlease();

    }
}
