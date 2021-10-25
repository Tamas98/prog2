package epam.education.prog2.streams.domain;

import java.util.List;
import java.util.Objects;

/**
 * TODO docme.
 */
public class Movie {

    private String title;
    private int rating;
    private int released;
    private List<String> genres;
    private String director;

    public Movie(String title, int rating, int released, List<String> genres, String director) {
        this.title = title;
        this.rating = rating;
        this.released = released;
        this.genres = genres;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Movie movie = (Movie) o;
        return rating == movie.rating && released == movie.released && title.equals(movie.title) && genres.equals(movie.genres) && director.equals(movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, rating, released, genres, director);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", released=" + released +
                ", genres=" + genres +
                ", director='" + director + '\'' +
                '}';
    }
}
