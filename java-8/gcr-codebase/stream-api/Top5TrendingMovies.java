
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Movie{
	private String name;
	private int releasedYear;
	private double rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReleasedYear() {
		return releasedYear;
	}
	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	Movie(String name,double rating,int releasedYear){
		this.name=name;
		this.releasedYear=releasedYear;
		this.rating=rating;
	}
	
	@Override
	public String toString() {
        return name + " | Rating: " + rating + " | Year: " + releasedYear;
    }
}

public class Top5TrendingMovies {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
                new Movie("Pushpa 2", 8.5, 2024),
                new Movie("Jawan", 8.2, 2023),
                new Movie("Animal", 8.8, 2023),
                new Movie("Pathaan", 7.9, 2023),
                new Movie("KGF 2", 8.9, 2022),
                new Movie("RRR", 9.1, 2022),
                new Movie("Salaar", 8.4, 2024),
                new Movie("Dunki", 7.5, 2023)
        );
		
		movies.stream().filter(movie->movie.getReleasedYear()>=2022)
		.sorted(Comparator.comparing(Movie::getRating).reversed()).limit(5).forEach(System.out::println);

	}
}
