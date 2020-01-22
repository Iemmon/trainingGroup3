package factorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestCalculator {

    @Parameterized.Parameter
    public int input;
    @Parameterized.Parameter(1)
    public String output;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {5, "120"},
                {100, "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"}
        };

    }

    @Test
    public void testSum() {
        List<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);

        new Calculator().sum(arr, 9, 1);
        for (Integer i : arr) {
            System.out.println(i);
        }
        List<Integer> result = Arrays.asList(9, 8, 0, 1);
        assertArrayEquals(result.toArray(), arr.toArray());
    }

    @Test
    public void testMultiply() {
        List<Integer> arr1 = Arrays.asList(5, 5);
        List<Integer> arr2 = Arrays.asList(5, 5);
        List<Integer> expected = Arrays.asList(5, 2, 0, 3);
        assertArrayEquals(expected.toArray(), new Calculator().multiply(arr1, arr2).toArray());
    }

    @Test
    public void testGetFactorial() {
        assertEquals(output, new Calculator().getFactorial(input));
    }

    @Test
    public void testNumToList() {
        assertArrayEquals(Arrays.asList(0, 2, 1).toArray(), new Calculator().numToList(120).toArray());
    }

    @Test
    public void testListToString() {

        assertEquals("120", new Calculator().listToString(Arrays.asList(0, 2, 1)));
    }
}
