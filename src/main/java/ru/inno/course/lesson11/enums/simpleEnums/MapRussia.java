package ru.inno.course.lesson11.enums.simpleEnums;

public class MapRussia {

    public static void main(String[] args) {
        go(Sides.SOUTH);
    }

    private static void go(Sides side) {
        System.out.println(side);
        if (side == Sides.WEST) {
            System.out.println("Идём на запад");
        } else if (side == Sides.SOUTH) {
            System.out.println("Идём на юг");
        }
    }

}
