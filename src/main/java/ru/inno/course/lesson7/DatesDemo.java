package ru.inno.course.lesson7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesDemo {

    public static void main(String[] args) {

//        String dateNow = "07.11.24";
//        System.out.println(dateNow + "30");

//        LocalDate date = LocalDate.now();
//        System.out.println(date);


//        LocalDate date = LocalDate.of(2024, 11, 30);
//        System.out.println(date.getDayOfWeek());
//        date = date.plusDays(30);
//        System.out.println(date);
//        System.out.println(date.plusMonths(2));

//        String dateNow = "2024-05-05";
//        LocalDate date = LocalDate.parse(dateNow);
//        System.out.println(date);

//        LocalTime time = LocalTime.now();
//        System.out.println(time);
//        System.out.println(LocalTime.of(23,55,55));


        LocalDate date = LocalDate.of(2024, 11, 30);
        LocalTime time = LocalTime.now();
        LocalDateTime timestamp = LocalDateTime.of(date, time);

        System.out.println(timestamp);

    }
}
