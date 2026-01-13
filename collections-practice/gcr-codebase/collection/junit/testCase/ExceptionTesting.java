
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ExceptionTesting {
    private ExceptionTest exceptions;
    @BeforeEach
    void setup() {
        exceptions=new ExceptionTest();
    }
    @Test
    void testException() {
        assertThrows(ArithmeticException.class,()->{
            exceptions.exceptionS(10);
        });
    }
}