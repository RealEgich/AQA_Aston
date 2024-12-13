package Lesson_14_junit_5_test;
import Lesson_14_junit_5.Factorial;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void init() {
        factorial = new Factorial();
    }

    @Test
    public void factorialTest() {
        assertTrue(factorial.getFactorial(0) == 1);
        assertTrue(factorial.getFactorial(1) == 1);
        assertTrue(factorial.getFactorial(11) == 39916800);
    }

    @Test
    public void factorialNegativeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.getFactorial(-1);
        });

    }
}
