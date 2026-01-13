import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class EvenTesting {
    private EvenCheck evencheck;
    @BeforeEach
    void setup() {
        evencheck=new EvenCheck();
    }
    @ParameterizedTest
    @ValueSource(ints= {2,3,4,6,7})
    void evenTesting(int a) {
        assertTrue(evencheck.isEven(a));
    }
}