package ru.inno.course.lesson9.Records.Records;

public class JustClass {

    public static void main(String[] args) {
        HumanR humanR = new HumanR("Запись", "email@ya.ru");
        System.out.println(humanR.email());
        System.out.println(humanR.name());
        humanR = new HumanR("НОвая запись", "safasfa@ya.ru");
        System.out.println(humanR.email());
        System.out.println(humanR.name());
        humanR.saySmth();
    }
}
