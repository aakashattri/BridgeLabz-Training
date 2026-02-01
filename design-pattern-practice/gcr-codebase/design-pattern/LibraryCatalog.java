package design_pattern_practice.gcr_codebase.design_patterns;
import java.util.*;

public class LibraryCatalog {
	private List<Book>books=new ArrayList<>();
	private List<Observer>observers=new ArrayList<>();
	private static LibraryCatalog instance;
	private LibraryCatalog(){};
	
	public static synchronized LibraryCatalog getInstance() {
		if(instance==null) {
			instance=new LibraryCatalog();
		}
		return instance;
	}
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book Added: "+book.getTitle());	
	}
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	public void notifyObserver(String bookName) {
		for(Observer o:observers) {
			o.update(bookName);
		}
	}
}
