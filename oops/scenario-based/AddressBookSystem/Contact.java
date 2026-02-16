
import java.util.Objects;

public class Contact {

    public String firstName, lastName, address, city, state, zip, phone, email;

    public Contact() {}

    public Contact(String firstName, String lastName, String address, String city,
                   String state, String zip, String phone, String s) {
        this.firstName =firstName;
        this.lastName= lastName;
        this.address=address;
        this.city=city;
        this.state= state;
        this.zip =zip;
        this.phone=phone;
        this.email = email;
    }

    // UC7 Duplicate Check
    @Override
    public boolean equals(Object o) {
        Contact c = (Contact) o;
        return firstName.equalsIgnoreCase(c.firstName)
                && lastName.equalsIgnoreCase(c.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }

    @Override
    public String toString() {
        return firstName + "," + lastName + "," + address + "," + city + "," +
                state + "," + zip + "," + phone + "," + email;
    }
}
