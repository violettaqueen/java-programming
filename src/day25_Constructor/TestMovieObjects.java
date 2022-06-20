package day25_Constructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA", "Java Developer: Zero to Hero", "Adventure, Comedy, Thriller", LocalDate.of(2021, 4, 18), "Kuzzat Altay");

        movie1.casts.addAll(Arrays.asList("Muhtar", "Ali", "Ozzy", "Violetta", "Shukur", "Kadifa", "Entisar", "Nihan"));

        System.out.println(movie1);

    }
}
/*
create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie
 */