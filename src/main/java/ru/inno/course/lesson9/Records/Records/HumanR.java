package ru.inno.course.lesson9.Records.Records;

public record HumanR(String name, String email) {

    public void saySmth(){
        System.out.println("Hello!");
    }

}
// 1. Неизменяемый класс, значения менять нельзя
// 2. Если значение все таки нужно поменять, придется создавать новый объект
