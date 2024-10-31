package ru.inno.course.lesson4;

public class World {

    public static void main(String[] args) {
        Human jack = new Human("Джек", 124);
        jack.getOlder();
        jack.getOlder();

        int jackAge = jack.getAge();
      //  System.out.println(jackAge);



//        jack.age += 1000; // jack.age = jack.age + 1;  // jack.age++;
//        jack.name = "Маршал";
//        System.out.println(jack.age);
//        System.out.println(jack.name);
    }

}
