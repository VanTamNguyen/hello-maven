import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    @Disabled
    public void testHello() {
        System.out.println("TEST - Hello...");
    }

    @Test
    @Disabled
    public void testWorld() {
        System.out.println("TEST - World!!!");
    }

    @Test
    public void testSum() {
        HelloWorld helloWorld = new HelloWorld();
        int sum = helloWorld.sum(10, 10);
        assertEquals(20, sum);
    }
}