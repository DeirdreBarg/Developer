import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleAdditionTest {

    @Test
    public void testAddition() {
        int result = add(2, 3);
        assertEquals(5, result);
    }

    public int add(int a, int b) {
        return a + b;
    }
}