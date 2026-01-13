
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTesting {

    private UserRegistration userRegistration;

    @BeforeEach
    void setup() {
        userRegistration = new UserRegistration();
    }

    @Test
    @DisplayName("Testing User Registration Success")
    void testingRegistration() {

        userRegistration.registerUser(
                "anu",
                "anu@gmail.com",
                "password123"
        );

        assertEquals("anu", userRegistration.getUserName());
        assertEquals("anu@gmail.com", userRegistration.getEmail());
        assertEquals("password123", userRegistration.getPassword());
    }

    @Test
    @DisplayName("Testing Registration With Empty Username")
    void testingRegistrationWithEmptyName() {

        assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("", "anu@gmail.com", "password123");
        });
    }
}