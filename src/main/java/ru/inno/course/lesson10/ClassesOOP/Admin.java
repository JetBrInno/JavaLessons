package ru.inno.course.lesson10.ClassesOOP;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Admin admin = (Admin) o;
        return Objects.equals(token, admin.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }
}
