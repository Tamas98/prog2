package epam.education.prog2.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import epam.education.prog2.streams.domain.Movie;

/**
 * TODO docme.
 */
public class StreamsExample {

    private final List<Movie> movieList;

    public StreamsExample() {
        this.movieList = Arrays.asList(
                    new Movie("Halloween", 8, 1978, Arrays.asList("Horror", "Thriller"), "John Carpenter"),
                    new Movie("Halloween Kills", 6, 2021, Arrays.asList("Horror", "Thriller"), "David Gordon Green"),
                    new Movie("A Nightmare on Elm Street", 8, 1984, Arrays.asList("Horror"), "Wes Craven"),
                    new Movie("Friday the 13th", 6, 1980, Arrays.asList("Horror", "Thriller", "Mystery"), "Sean S. Cunningham"),
                    new Movie("Scream", 7, 1996, Arrays.asList("Horror", "Mystery"), "Wes Craven"),
                    new Movie("The Texas Chain Saw Massacre", 8, 1974, Arrays.asList("Horror"), "Tobe Hooper"),
                    new Movie("It",7, 2017, Arrays.asList("Horror"), "Andy Muschietti"),
                    new Movie("The Matrix", 9, 1999, Arrays.asList("Action", "Sci-Fi"), "Lana Wachowski, Lilly Wachowski"),
                    new Movie("Spider-Man", 7, 2002, Arrays.asList("Action", "Adventure", "Sci-Fi"), "Sam Raimi"),
                    new Movie("Django Unchained", 8, 2012, Arrays.asList("Drama", "Western"), "Quentin Tarantino"),
                    new Movie("Shutter Island", 8, 2010, Arrays.asList("Mystery", "Thriller"), "Martin Scorsese"),
                    new Movie("Batman Begins", 8, 2005, Arrays.asList("Action", "Adventure"), "Christopher Nolan"),
                    new Movie("Underwater", 6, 2020, Arrays.asList("Horror", "Adventure", "Sci-Fi"), "Tobe Hooper"),
                    new Movie("Scooby-Doo on Zombie Island", 8, 1998, Arrays.asList("Animation", "Adventure", "Comedy"), "Jim Stenstrum")
        );
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void printSearchResult(String searchValue) {
        this.movieList.stream().filter(movie -> movie.getTitle().contains(searchValue))
                                .map(Movie::getTitle)
                                .forEach(System.out::println);
    }

    public void printMoviesAfterDate(int year) {
        this.movieList.stream().filter(movie -> movie.getReleased() > year)
                                .map(Movie::getTitle)
                                .forEach(System.out::println);
    }

    public void printMovieFromYearAndGenre(int year, String genre) {
        this.movieList.stream().filter(movie -> movie.getGenres().contains(genre) && movie.getReleased() == year)
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }

    public long getMovieNumberWithHighRating() {
        return this.movieList.stream().filter(movie -> movie.getRating() >= 7).count();
    }

    public void printTop3MovieTitle() {
        this.movieList.stream()
                        .sorted((movie1,movie2) -> movie2.getRating() - movie1.getRating())
                        .limit(3)
                        .map(Movie::getTitle)
                        .forEach(System.out::println);
    }

    public String getWorstMovieDirectors() {
        return this.movieList.stream()
                .sorted(Comparator.comparingInt(Movie::getRating))
                .limit(3)
                .map(Movie::getDirector)
                .collect(Collectors.joining(", ", "[" , "]"));
    }

    public Map<Integer, List<Movie>> pairSearchResultByRating(String searchValue) {
        return this.movieList.stream()
                .filter(movie -> movie.getTitle().contains(searchValue))
                .collect(Collectors.groupingBy(Movie::getRating));
    }
}
