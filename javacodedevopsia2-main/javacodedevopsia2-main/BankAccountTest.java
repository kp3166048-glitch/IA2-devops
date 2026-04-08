import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount acc = new BankAccount(100);
        acc.deposit(50);
        assertEquals(150, acc.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount acc = new BankAccount(100);
        acc.withdraw(40);
        assertEquals(60, acc.getBalance());
    }

    @Test
    void testBalance() {
        BankAccount acc = new BankAccount(200);
        assertEquals(200, acc.getBalance());
    }
}
