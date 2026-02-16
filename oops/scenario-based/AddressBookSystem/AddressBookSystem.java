
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AddressBookSystem {
	private List<Contact> contacts=new ArrayList<>();
    private StorageService storage;

    public AddressBookSystem(StorageService storage){
    	this.storage=storage;
    	}
    public void add(Contact c){
        if(contacts.contains(c)) System.out.println("Duplicate!");
        else contacts.add(c);
    }
    public void edit(String name,String city){
        contacts.stream().filter(c->c.firstName.equalsIgnoreCase(name))
                .forEach(c->c.city=city);
    }
    public void delete(String name){
        contacts.removeIf(c->c.firstName.equalsIgnoreCase(name));
    }
    public void searchCity(String city){
        contacts.stream().filter(c->c.city.equalsIgnoreCase(city))
                .forEach(System.out::println);
    }
    public long countState(String state){
        return contacts.stream().filter(c->c.state.equalsIgnoreCase(state)).count();
    }

    public void sortName(){
        contacts.stream().sorted(Comparator.comparing(c->c.firstName))
                .forEach(System.out::println);
    }

    public void sortCity(){
        contacts.stream().sorted(Comparator.comparing(c->c.city))
                .forEach(System.out::println);
    }

    public void saveAsync(){
        ExecutorService ex=Executors.newSingleThreadExecutor();
        ex.submit(()->{
            try{storage.save(contacts);}catch(Exception e){e.printStackTrace();}
        });
        ex.shutdown();
    }

    public void load() throws Exception {
        contacts=storage.load();

        if(contacts.isEmpty()){
            System.out.println("No records found!");
            return;
        }

        System.out.println("----- Contacts -----");
        contacts.forEach(System.out::println);
    }
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Address Book Program");
        AddressBookSystem book=new AddressBookSystem(new DBStorage());
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("1 Add 2 Edit 3 Delete 4 Search 5 Sort 6 Save 7 Load 8 Exit");
            int ch=sc.nextInt(); sc.nextLine();

            switch(ch){

                case 1:
                    System.out.print("First Name: "); String fn=sc.nextLine();
                    System.out.print("Last Name: "); String ln=sc.nextLine();
                    System.out.print("City: "); String city=sc.nextLine();
                    System.out.print("State: "); String state=sc.nextLine();
                    System.out.println("zip: "); String email=sc.nextLine();
                    System.out.println("phone: "); String zipCode=sc.nextLine();
                    System.out.println("Email: "); String phone=sc.nextLine();
                    book.add(new Contact(fn,ln,"address:",city,state,zipCode,phone,email));
                    break;

                case 2:
                    System.out.print("Name: ");
                    book.edit(sc.nextLine(),sc.nextLine());
                    break;

                case 3:
                    book.delete(sc.nextLine());
                    break;

                case 4:
                    book.searchCity(sc.nextLine());
                    break;

                case 5:
                    book.sortName();
                    break;

                case 6:
                    book.saveAsync();
                    break;

                case 7:
                    book.load();
                    break;

                case 8:
                	System.out.println("System Exited.🤝");
                    return;
            }
        }
    }
}
