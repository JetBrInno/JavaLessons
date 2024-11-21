package ru.inno.course.lesson10.ClassesOOP;

public class User {

    private String name;

    private String surname;

    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Это конструктор юзера");
    }

    public void sendMessage(String messageText){
        System.out.println(messageText);
    }
}
