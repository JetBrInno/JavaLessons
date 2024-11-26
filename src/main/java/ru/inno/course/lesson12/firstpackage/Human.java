package ru.inno.course.lesson12.firstpackage;

public class Human {

    public void publicMethod(){
        System.out.println("Это публичный метод");
    }

    private void privateMethod(){
        System.out.println("Это приватный метод");
    }

    protected void protectedMethod(){
        System.out.println("Это защищенный(протектед) метод");
    }
}
