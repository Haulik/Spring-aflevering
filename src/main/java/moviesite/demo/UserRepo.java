package moviesite.demo;

import java.util.*;

public class UserRepo {

    ArrayList<Movie> movies = new ArrayList<Movie>();

    Movie movie1 = new Movie ("hokus", 79, "Horror", 24091991);
    Movie movie2 = new Movie ("hokus", 79, "Horror", 24091991);
    Movie movie3 = new Movie ("hokus", 79, "Horror", 24091991);
    Movie movie4 = new Movie ("hokus", 79, "Horror", 24091991);


public void addmovies(){

    movies.add(movie1);
    movies.add(movie2);
    movies.add(movie3);
    movies.add(movie4);
}

public ArrayList<Movie> Getall(){

    return movies;

}
}