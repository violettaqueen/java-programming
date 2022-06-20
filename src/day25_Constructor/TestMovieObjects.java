package day25_Constructor;

import java.time.LocalDate;
import java.util.Arrays;

public class TestMovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("Usa","Speed","Action", LocalDate.of(2021,12,4),"Mr.Smith");
        Movie movie2 = new Movie("Japan","Samurai","Thriller", LocalDate.of(2022, 1,6), "Sato");

        movie1.addCast("Emily Brown");

        Movie[] movies = {movie1,movie2};

        System.out.println(movie1);

    }
}
