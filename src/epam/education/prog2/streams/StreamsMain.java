package epam.education.prog2.streams;

/**
 * TODO docme.
 */
public class StreamsMain {
    public static void main(String[] args) {
        StreamsExample se = new StreamsExample();
        //.printSearchResult("asdfasfa");
        //se.printMoviesAfterDate(2000);
        //se.printMovieFromYearAndGenre(1978, "Horror");
        //System.out.println(String.format("Number of movies with rating 7 or higher: %d", se.getMovieNumberWithHighRating()));
        //se.printTop3MovieTitle();
        //System.out.println(se.getWorstMovieDirectors());
        se.pairSearchResultByRating("a");
    }
}
