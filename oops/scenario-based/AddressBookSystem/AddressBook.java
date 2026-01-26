

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class AddressBook {

    HashMap<String, Contact> addressBook=new HashMap<>();

    void addNewContact(String name, Contact contact) {
        if (addressBook.containsKey(name)) {
            System.out.println("Contact already exists!");
            return;
        }
        addressBook.put(name, contact);
         saveAllContactsToFile();
    }

    void inputDetail(String name,String input) throws Exception {
        String[]arr=input.split(",");

        if (arr.length!=7) {
            System.out.println("Invalid input format!");
            return;
        }

        Contact contact=new Contact(arr[0],arr[1], arr[2], arr[3],arr[4], arr[5], arr[6]);

        if (!addressBook.containsKey(name)) {
            addNewContact(name,contact);
        } else {
            edit(name,contact);
        }
    }

    void edit(String name,Contact updates)throws Exception {
    	BufferedReader bfr=new BufferedReader(new FileReader("src/AddressBookSystem/AddressBook.txt"));
        if (!addressBook.containsKey(name)) {
            System.out.println("Person does not exist");
        } else {
            addressBook.put(name,updates);
            saveAllContactsToFile();
            System.out.println("Contact updated");
        }
    }

    void delete(String name) {
        if (addressBook.remove(name)!=null) {
        	saveAllContactsToFile();
            System.out.println("Contact deleted");
        } else {
            System.out.println("Contact not found");
        }
    }

    void display(){
        if (addressBook.isEmpty()){
            System.out.println("No contacts available");
            return;
        }

        addressBook.forEach((k,v)->System.out.println(k+" | "+v));
    }
    private void saveAllContactsToFile() {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter("src/AddressBookSystem/AddressBook.txt",true))) {

            for (String name:addressBook.keySet()) {
                bw.write(name+" : "+addressBook.get(name));
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println("Error saving file: "+e.getMessage());
        }
    }

}
