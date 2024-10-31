package ru.inno.course.lesson5.justclasses;

public class World {

    public static void main(String[] args) {
        Human jack = new Human("Джек", 124);
        jack.setAge(50);

        System.out.println(jack.getAge());
        System.out.println(jack.getEmail());

        jack.setEmail("superjack@mail.ru");
        System.out.println(jack.getEmail());


        jack.setPhone("8953253252");

        String jackPhone = jack.getPhone();
        System.out.println(jackPhone);
    }

}
