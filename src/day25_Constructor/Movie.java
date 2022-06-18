package day25_Constructor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Movie {

    public String country, title, genre;
    public LocalDate releaseDate;
    public String director;
    public ArrayList<String> casts;

    public Movie(String country, String title, String genre, LocalDate releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }
    public ArrayList<String> addCast(){
         ArrayList<String> casts = new ArrayList<>();
         return casts;
    }

}
/*
1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts
 */