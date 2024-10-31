package ru.inno.course.lesson5.interfaces2;

public class FantasyWorld {

    public static void main(String[] args) {
        Elf elf = new Elf();
        Dwarf dwarf = new Dwarf();

        elf.attack(100);
        elf.hide();

        dwarf.defend(50);
        dwarf.makeWeapon();
    }
}
