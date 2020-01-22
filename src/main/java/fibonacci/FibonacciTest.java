package fibonacci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciTest {

    @Parameterized.Parameter
    public int parameter;

    @Parameterized.Parameter(1)
    public int expected;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {1, 1},
                {2, 1},
                {3, 2},
                {4, 3},
                {5, 5},
                {6, 8},
                {7, 13},
                {8, 21},
                {9, 34}
        });
    }

    @Test
    public void testNonRecursiveFibonacciMethod() {
        int fib = Fibonacci.findFibonacciNonRecursively(parameter);
        assertEquals(expected, fib);
    }

    @Test
    public void testRecursiveFibonacciMethod() {
        int fib = Fibonacci.findFibonacciRecursively(parameter);
        assertEquals(expected, fib);
    }

}
