import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

    LinearSearch ls = new LinearSearch();

    @Test
    void testFound() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(2, ls.search(arr, 3));
    }

    @Test
    void testNotFound() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(-1, ls.search(arr, 5));
    }
}
