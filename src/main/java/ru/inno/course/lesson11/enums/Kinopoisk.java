package ru.inno.course.lesson11.enums;

public class Kinopoisk {

    public static void main(String[] args) {
        Movie movie1 = new Movie("1+1", Genre.COMEDY); // 1
        Movie movie2 = new Movie("Интерстеллар", Genre.SCI_FI); // фантастика 2
        Movie movie3 = new Movie("Фоллаут", Genre.SCI_FI); // научная фантастика
        Movie movie4 = new Movie("Звездные воины", Genre.SCI_FI); // научная фантастика
        Movie movie5 = new Movie("Звездный путь", Genre.SCI_FI); // научная фантастика
        Movie movie6 = new Movie("Звездный путь", Genre.SCI_FI); // научная фантастика
        System.out.println(Genre.SCI_FI == Genre.SCI_FI);
        System.out.println(movie5.getGenre());
    }
}
