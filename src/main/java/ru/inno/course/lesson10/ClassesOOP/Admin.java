package ru.inno.course.lesson10.ClassesOOP;

public class Admin extends User {

    private String token;

    public Admin(String name, int id, String token) {
        super(name, id);
        this.token = token;
        System.out.println("Это конструктор админа");
    }

    public void ban(){
        System.out.println("Я тебя забанил");
    }

    public void unban(){
        System.out.println("Я тебя разбанил");
    }
}
