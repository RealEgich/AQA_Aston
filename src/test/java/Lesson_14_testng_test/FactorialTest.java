package Lesson_14_testng_test;
import Lesson_14_testng.Factorial;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class FactorialTest {

    private Factorial factorial;

    @BeforeMethod
    public void init() {
        factorial = new Factorial();
    }

    @Test
    public void factorialTest() {
        assertEquals(factorial.getFactorial(0), 1);
        assertEquals(factorial.getFactorial(1), 1);
        assertEquals(factorial.getFactorial(11), 39916800);
    }

    @Test
    public void factorialNegativeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.getFactorial(-1);
        });

    }

}
