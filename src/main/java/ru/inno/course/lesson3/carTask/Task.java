package ru.inno.course.lesson3.carTask;

public class Task {

    public static void main(String[] args) {
        Car[] garage = {
            new Car(100000, "BMW"),
            new Car(90000, "Mazda")
        };
        System.out.println(garage[0].brand);
        System.out.println(garage[1].brand);
    }
}
