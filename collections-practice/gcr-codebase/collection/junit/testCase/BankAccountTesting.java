
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTesting {

    private BankAccount bankaccount;

    @BeforeEach
    void setup() {
        bankaccount = new BankAccount();
        bankaccount.setBalance(1000);
    }

    @Test
    @DisplayName("Testing AddMoney Method")
    void testingAddMoney() {
        bankaccount.addmoney(500);
        assertEquals(1500, bankaccount.getBalance());
    }

    @Test
    @DisplayName("Testing Withdraw Method")
    void testingWithdraw() {
        bankaccount.withdraw(400);
        assertEquals(600, bankaccount.getBalance());
    }

    @Test
    @DisplayName("Testing GetBalance Method")
    void testingGetBalance() {
        assertEquals(1000, bankaccount.getBalance());
    }

    @Test
    @DisplayName("Testing Withdraw With Insufficient Balance")
    void testingWithdrawInsufficientBalance() {
        assertThrows(IllegalArgumentException.class, () -> {
            bankaccount.withdraw(2000);
        });
    }
}