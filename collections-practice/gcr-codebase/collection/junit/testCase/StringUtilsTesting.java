import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.*;

public class StringUtilsTesting {
    private StringUtils stringUtils;
    @BeforeEach
    void Setup() {
        stringUtils =new StringUtils();
    }

    @Test
    @DisplayName("Reverse Testing")
    void reverseTesting() {
        assertEquals("garuna",stringUtils.reverse("anurag"));
    }
    @Test
    @DisplayName("Palindrome Testing")
    void palindromeTesting() {
        assertEquals(false,stringUtils.isPalindrome("anurag"));
    }
    @Test
    @DisplayName("UpperCase  Testing")
    void toUpperCaseTesting() {
        assertEquals("ANURAG",stringUtils.toUpperCase("anurag"));
    }
}