package ru.inno.course.lesson2;

public class Human {
    String name;
    int age;
    String phone;
    String email;
    double rating;

    public Human(String name, int age, String phone, String email, double rating) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.rating = rating;
    }

    public Human(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
