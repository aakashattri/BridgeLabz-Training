
interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}
abstract class LibraryItem{
    private int itemId;
    private String title;
    private String author;
    LibraryItem(int id,String t,String a){
        itemId=id;
        title=t;
        author=a;
    }
    abstract int getLoanDuration();
    void getItemDetails(){
        System.out.println(title+" "+author);
    }
}
class Book extends LibraryItem{
    Book(int i,String t,String a){
        super(i,t,a);
    }
    int getLoanDuration(){
        return 14;
    }
}
class Magazine extends LibraryItem{
    Magazine(int i,String t,String a){
        super(i,t,a);
    }
    int getLoanDuration(){
        return 7;
    }
}
class DVD extends LibraryItem{
    DVD(int i,String t,String a){
        super(i,t,a);
    }
    int getLoanDuration(){
        return 3;
    }
}
public class LibraryManagementSystem{
    public static void main(String[] args){
        LibraryItem item=new Book(1,"Java","James");
        item.getItemDetails();
    }
}