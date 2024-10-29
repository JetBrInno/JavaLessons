package ru.inno.course.lesson4;

public class ForAndArray {

    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 15;
        numbers[1] = 20;
        numbers[2] = 100;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " элемент равен: " + numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }


    }

}
