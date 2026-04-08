import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxNumberTest {

    MaxNumber max = new MaxNumber();

    @Test
    void testMax1() {
        assertEquals(5, max.findMax(5, 3, 2));
    }

    @Test
    void testMax2() {
        assertEquals(10, max.findMax(4, 10, 7));
    }

    @Test
    void testMax3() {
        assertEquals(8, max.findMax(1, 2, 8));
    }
}
