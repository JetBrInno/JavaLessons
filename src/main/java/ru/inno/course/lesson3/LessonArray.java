package ru.inno.course.lesson3;

public class LessonArray {

    public static void main(String[] args) {

        // 1. Слишком много строк кода
        // 2. Неудобно работать с оценками, если мы хотим, к примеру, вывести на экран их все сразу
        // 3. Каждый раз нужно придумывать новое имя переменной
        // 4. Можно легко случайно забыть/потерять какие-то данные
        double mark0 = 0.6;
        double mark1 = 0.7;
        double mark2 = 0.8;
        double mark3 = 0.9;
        double mark4 = 0.65;
//        System.out.println(mark0);
//        System.out.println(mark1);
//        System.out.println(mark3);
//        System.out.println(mark4);

        // Особенности
        // 1. Мы обязаны указать размер массива
        // 2. Мы можем заполнить его в любой момент времени (сразу или потом)
        // 3. Можем заполнять его в разном порядке и не полностью
        // 4. Все элементы массива имеют один и тот же тип
        double[] marks = new double[10]; // 0 1 2 3 4 5 6 7 8 9
        marks[8] = 0.55;
        marks[0] = 0.6;
        marks[1] = 0.7;
        marks[2] = 0.8;
        marks[3] = 0.9;
        marks[4] = 0.65;
//
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
//        marks[4] = 0.8;
//        System.out.println(marks[4]);
            String[] fruits = new String[100];
            fruits[0] = "Apple";
            fruits[1] = "Orange";
            fruits[2] = "Pineapple";
       // System.out.println(fruits[0] + " " + fruits[1] + " " + fruits[2]);

        String[] fruits2 = new String[]{"Apple", "Orange", "Pineapple"};

        String[] fruits3 = {"Apple", "Orange", "Pineapple"};
    }

}
