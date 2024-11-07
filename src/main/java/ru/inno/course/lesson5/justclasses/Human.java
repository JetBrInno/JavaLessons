package ru.inno.course.lesson5.justclasses;

public class Human {
    private String name;
    private int age;
    private String phone;
    private String email;
    private double rating;

    public Human(String name, int age, String phone, String email, double rating) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.rating = rating;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() { // int - тип возвращаемого значения
        return age;  // return - вернуть значение
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public double getRating() {
        return rating;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", rating=" + rating +
            '}';
    }
}
