
import tools.jackson.databind.ObjectMapper;


class User {
    public String name;
    public int age;
    public String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}

public class JavaObjectToJson {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            User user = new User("Anurag", 23, "anurag@gmail.com");

            String jsonObject = objectMapper.writeValueAsString(user);
            System.out.println(jsonObject);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
