package oops.this_static_and_final;

class Book{
	static String libraryName="Gla University Library";
	private String title;
	private String author;
	private final long isbn;
	Book(String title,String author,long isbn){
		this.title=title;
		this.author=author;
		this.isbn= isbn;
	}

	public static void displayLibraryName(){
		System.out.println("Library Name: "+libraryName);
	}

	public void display(){
		if(this instanceof Book){
			System.out.println("Title: "+title);
			System.out.println("Author: "+ author);
			System.out.println("ISBN: "+isbn);
			System.out.println("----------------------------");
		}
		else{
			System.out.println("Not an instance");
		}
	}

	public static void main(String args[]){
		Book b1=new Book("C++","idk", 1503290563);
		Book b2=new Book("Java","Sun Microsystem",0743273565);
		displayLibraryName();
		b1.display();
		System.out.println();
		b2.display();
	}
}