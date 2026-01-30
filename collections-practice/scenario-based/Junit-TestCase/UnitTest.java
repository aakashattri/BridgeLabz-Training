
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
public class UnitTest {
    private Program program;

    @BeforeEach
    public void setup() {
        program=new Program(15000);
    }

    @Test
    void test_Deposite_ValidAmount() throws NegativeAmountException {
        program.deposite(5000);
        assertEquals(20000,program.getBalance());
    }

    @Test
    void test_Withdraw_ValidAmount() throws InsufficientBalanceException {
        program.withdraw(5000);
        assertEquals(10000,program.getBalance());
    }
}