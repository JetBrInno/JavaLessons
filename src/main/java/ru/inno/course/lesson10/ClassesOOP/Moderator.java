package ru.inno.course.lesson10.ClassesOOP;

public class Moderator extends User {

    public String token;

    public Moderator(String name, int id) {
        super(name, id);
        System.out.println("Создан модератор");
    }

    public void sendAlert(){
        System.out.println("Я вам запрещаю нарушать правила");
       // unBanMePlease();
        sendMessage("Привет");
    }


}
