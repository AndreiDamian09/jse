package eu.deic.ase.c04_jcf;

import java.util.Objects;

public class Movie implements Comparable<Movie> {

    private int year;
    private String title;
    private float rating;

    public Movie(int year, String title, float rating) {
        this.year = year;
        this.title = title;
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("%s from %d and has %5.2f rating",this.title,this.year,this.rating);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && Float.compare(rating, movie.rating) == 0 && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, title, rating);
    }

    @Override
    public int compareTo(Movie o) {
        if(this.rating== o.rating){
            return 0;
        }
        if(this.rating >o.rating){
            return 1;
        }else{
            return -1;
        }
    }
}
