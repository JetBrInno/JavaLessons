package ru.inno.course.lesson6.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework {

    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>();
        companies.add(new Company("DC", 1934));
        companies.add(new Company("Marvel", 1939));

        List<String> dcFilms = companies.get(0).getFilms();
        dcFilms.add("Темный рыцарь");
        dcFilms.add("Джокер");
        dcFilms.add("Чудо-женщина");

        List<String> marvelFilms = companies.get(1).getFilms();
        marvelFilms.add("Человек паук");
        marvelFilms.add("Человек муравей");
        marvelFilms.add("Дэдпул");

        for (Company company : companies)
        {
            System.out.println(company.getName() + ": " + company.getFilms());
        }
    }
}
