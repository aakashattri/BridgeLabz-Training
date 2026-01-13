import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TimeoutTesting {
    private TimeOutCheck timeoutcheck;

    @BeforeEach
    void setup() {
        timeoutcheck=new TimeOutCheck();
    }
    @Test
    @DisplayName("TimeOut Testing")
    @Timeout(2)
    void testingTimeOut() {
        assertTrue(timeoutcheck.timeRunningCheckout());

    }
}