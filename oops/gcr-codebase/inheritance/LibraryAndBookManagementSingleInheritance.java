class Book{
    String title;
    int publicationYear;
    Book(String title,int publicationYear) {

        this.title=title;
        this.publicationYear=publicationYear;
        // TODO Auto-generated constructor stub
    }
    public void displayInfo() {
        System.out.println("Book Name: "+title);
        System.out.println("Publication year "+publicationYear);
    }
}
class Author extends Book{
    String name;
    String bio;
    Author(String title,int publicationYear, String name,String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    @Override
    public void displayInfo() {
        System.out.println("Author's name: "+name);
        System.out.println("Author's Bio: "+bio);
    }

}
public class LibraryAndBookManagementSingleInheritance {
    public static void main(String[] args) {
        Book b1=new Book("THE GATE KEEPER",2025);
        Author anurag=new Author(b1.title,b1.publicationYear,"Anurag","Always is Never");
        b1.displayInfo();
        anurag.displayInfo();
    }
}