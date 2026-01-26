

import java.util.Scanner;

public class AddressBookSystem {

    private AddressBook addressBook = new AddressBook();

    private void inputMethod() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Specify your action : ADD-MODIFY-DELETE-READ");
        String action = sc.nextLine().toUpperCase();

        switch (action) {
            case "ADD":
            case "MODIFY":
                details();
                break;

            case "READ":
                addressBook.display();
                break;

            case "DELETE":
                System.out.println("Enter name to delete:");
                String name = sc.nextLine();
                addressBook.delete(name);
                break;

            default:
                System.out.println("Invalid Action");
        }
    }

    public void details() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = sc.nextLine();

        System.out.println("Enter details (firstName,lastName,city,state,zipcode,phoneNumber,email):");
        String contact = sc.nextLine();

        addressBook.inputDetail(name, contact);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Address Book Program");
        AddressBookSystem obj = new AddressBookSystem();
        obj.inputMethod();
    }
}
