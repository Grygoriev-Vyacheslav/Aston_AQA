import org.example.FactorialCalculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyTest {

    @Test
    public void testFactorialPos() {
        FactorialCalculator fc = new FactorialCalculator();
        int result = fc.calculateFactorial(4);
        assertEquals(24, result);
    }

    @Test
    public void testFactorialZero() {
        FactorialCalculator fc = new FactorialCalculator();
        int result = fc.calculateFactorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialNeg() {
        FactorialCalculator fc = new FactorialCalculator();

        try {
            fc.calculateFactorial(-1);
            Assert.fail("Expected IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
