import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {

    @Test
    public void divideTest() {
        Arithmetic arithmetic = new Arithmetic();
        ArithmeticException thrown = assertThrows(
                ArithmeticException.class,
                () -> arithmetic.divide(10, 0),
                "Expected ArithmeticException thrown, but it didn't"
        );

        assertEquals(thrown.getMessage(), "Divide by zero");
    }
}
