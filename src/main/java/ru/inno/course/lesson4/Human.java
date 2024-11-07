package ru.inno.course.lesson4;

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

    public void getOlder() {
        if (this.age < 125)
        {
            this.age += 1;
            System.out.println("У меня день рождения!");
        }
        else {
            System.out.println("Вы достигли границы возраста");
        }
    }

    public int getAge() { // int - тип возвращаемого значения
        return age;  // return - вернуть значение
    }


    @Override
    public String toString() {
        return "Экземпляр класса Human по имени " + name;
    }
}
