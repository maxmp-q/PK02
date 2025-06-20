package ha09.a3;

import java.util.ArrayList;
import java.util.Comparator;

public class a3_main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Jurassic Park", 2015, 8.9));
        movies.add(new Movie("Harry Potter", 1999, 7.3));
        movies.add(new Movie("Star Wars", 1980, 9.9));
        movies.add(new Movie("Twilight", 2001, 6.4));
        movies.add(new Movie("Mace Runner", 2015, 8.6));
        movies.add(new Movie("Dune", 2024, 8.7));

        movies.stream()
                .filter(movie -> movie.getRating() >= 8.5)
                .sorted(Comparator.comparing(Movie::getYear).thenComparing(Movie::getRating, Comparator.reverseOrder()))
                .forEach(movie -> System.out.println(movie.getTitle()));
    }
}
