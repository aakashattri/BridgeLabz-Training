package oops.object_modelling;

import java.util.ArrayList;
class Book{
    private String title;
    private String author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    @Override
    public String toString(){
        return "Book{"+"title='"+title+'\''+", author='"+author +'\''+'}';
    }
}
class Library{
    private ArrayList<Book> books;
    public Library(){
        this.books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks(){
        System.out.println("Books in the library:");
        for (Book book : books){
            System.out.println(book);
        }
    }
}
public class LibraryAndBooks {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book book2=new Book("Marvel's Spiderman","Stan Lee");
        Book book1=new Book("Marvel's Spiderman","Stan Lee");
        Book book3=new Book("How to fly higher","Unknown");
        Library library1=new Library();
        Library library2=new Library();
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);
        library1.displayBooks();
		System.out.println();
        library2.displayBooks();
		System.out.println();
        System.out.println("Independent Book: "+book1);
        System.out.println("Independent Book: "+book3);

	}

}
