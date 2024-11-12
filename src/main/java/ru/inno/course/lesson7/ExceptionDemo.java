package ru.inno.course.lesson7;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        int firstNumber = new Scanner(System.in).nextInt();
        int secondNumber = new Scanner(System.in).nextInt();
        try {
            System.out.println("Результат: " + firstNumber/secondNumber);
        }
        catch (NullPointerException ex)
        {
            System.out.println("Делить на ноль нельзя!");
        }
        catch (Exception ex)
        {
            System.out.println("Делить на ноль нельзя!");
        }

        int firstNumber2 = new Scanner(System.in).nextInt();
        int secondNumber3 = new Scanner(System.in).nextInt();
        try {
            System.out.println("Результат: " + firstNumber2/secondNumber3);
        }
        catch (Exception ex)
        {
            System.out.println("Делить на ноль нельзя!");
        }
    }
}
