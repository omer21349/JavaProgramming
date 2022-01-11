package day31_Constructors;


import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country,title,Genre,releaseDate,director;
    public ArrayList<String>list=new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String cast){
        list.add(cast);
    }
    public void addCasts(String[]castes){
        list.addAll(Arrays.asList(castes));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", castes='" + list.size() + '\'' +
                '}';
    }
}
