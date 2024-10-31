package ru.inno.course.lesson5.interfaces2;

public class Elf implements Warrior{

    private int hp;

    @Override
    public void attack(int damage) {
        System.out.println("Атакуем с силой " + damage);
    }

    @Override
    public void defend(int powerDefense) {
        System.out.println("Защищаемся с силой " + powerDefense);
    }

    @Override
    public void heal(int addHp) {
        this.hp += addHp;
    }

    public void hide()
    {
        this.hp += 10;
    }
}
