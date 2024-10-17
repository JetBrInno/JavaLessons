package ru.inno.course.lesson1;

public class FirstClass {

    public static void main(String[] args) {

        int price = -10000000;

        byte balance = 100; // число которое умещается в границах байта ( - 128 до 127)
        short shortBalance = 10000; // число которое умещается в границах байта ( -32768 до 32767)
        int intBalance = 2000000000; // число от - 2 млрд до 2 млрд
        long longBalance = 50000000000000L; //
       // System.out.println(balance);

        char letter = 'a';
        String hello = "412412412414124124124 24141241241 24as-fa0-fa0-ag0%#$%$#^$#%#52%#";

       // System.out.println(hello);

        float number = 10.5F;
        double number2 = 10.5;


        // Что мы можем делать с переменными
        boolean auth = true;
        boolean holidays = false;

        System.out.println(auth || holidays);

        int x = 5;
        int y = 10;
        System.out.println((x + y) * 2.5);

        String name = "Семён";
        name = "Sam\n\n\n\n\n\n\n\n\n\n\n";
        System.out.println(name);
        System.out.println(name);

        String carName = "BMW";

        System.out.println(100 == 0);

        String username = "семён";
        String upperUsername = username.toUpperCase(); // метод делает буквы заглавными
        System.out.println(upperUsername);
    }
}
