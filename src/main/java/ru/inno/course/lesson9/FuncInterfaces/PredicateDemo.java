package ru.inno.course.lesson9.FuncInterfaces;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        List<String> carsColors = List.of("красный", "белый", "синий", "черный");

        Predicate<String> predicate = s -> {
            return s.equals("красный"); // тут мы пишем что хотим сделать
        };

        chooseBestCar(carsColors, predicate);
    }
    private static void chooseBestCar(List<String> carsColors, Predicate<String> predicate) {
        System.out.println("Список цветов автомобилей: ");

        for (String carColor : carsColors) {
            System.out.println(predicate.test(carColor));
        }
        System.out.println("Конец списка");
    }
}
