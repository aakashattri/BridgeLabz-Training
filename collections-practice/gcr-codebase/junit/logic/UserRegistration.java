
public class UserRegistration {

    private String userName;
    private String email;
    private String password;

    public void registerUser(String name, String email, String password)
            throws IllegalArgumentException {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }

        this.userName = name;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}