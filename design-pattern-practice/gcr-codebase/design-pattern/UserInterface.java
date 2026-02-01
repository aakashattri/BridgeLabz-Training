package design_pattern_practice.gcr_codebase.design_patterns;

public class UserInterface {

    public static void main(String[] args) {
        LibraryCatalog catalog=LibraryCatalog.getInstance();
        User anurag=UserFactory.createUser("student");
        User aakash=UserFactory.createUser("faculty");
        anurag.getRole();
        aakash.getRole();
        Observer s1=new StudentObserver("Anurag");
        Observer f1=new FacultyObserver("Dr. Aakash");
        catalog.registerObserver(s1);
        catalog.registerObserver(f1);
        Book book=new Book.BookBuilder("Timepass")
                .addAuthor("Anurag")
                .edition("3rd")
                .genre("Computer Science")
                .publisher("MIT Press")
                .build();
        catalog.addBook(book);
        s1.update(book.getTitle());
    }
}

