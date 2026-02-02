
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book{
	private String title;
	private String genre;
	private int pages;
	
	Book(String title, String genre,int pages){
		this.genre=genre;
		this.title=title;
		this.pages=pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
public class LibraryBooksStatistics {
	public static void main(String[] args) {
		List<Book>books=Arrays.asList(
				new Book("The godFather","Crime",1000),
				new Book("Startrak","Sci-fi",1500),
				new Book("Marvel","Scifi",2000),
				new Book("Dune","Historical",1100)
				);
		
		Map<String,IntSummaryStatistics>summary=books.stream().collect(Collectors.groupingBy(Book::getGenre,Collectors.summarizingInt(Book::getPages)));
		summary.forEach((k,v)->{
			System.out.println(k+" total: "+v.getCount()+" average: "+v.getAverage()+" max: "+v.getMax());
		});
	}
}
