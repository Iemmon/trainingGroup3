package task4.lesson10;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TemperatureConverterTest {
    private TemperatureConverter converter;

    @Parameterized.Parameter//for single element
    public double parameter;
    @Parameterized.Parameter(1)
    public double expected1;
    @Parameterized.Parameter(2)
    public double expected2;
    @Parameterized.Parameter(3)
    public double expected3;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 273.2, 32.0, -17.7},
                {-273.2, 0.0, -459.7, -169.5},
                {3.0, 276.2, 37.4, -16.1},
                {-5.0, 268.2, 23.0, -20.5}
        });
    }

    @Before
    public void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    public void convertCtoK() {
        double temperature = converter.convertCtoK(parameter);
        assertEquals(expected1, temperature, 0.05);

    }

    @Test
    public void convertFtoC() {
        assertEquals(expected3, converter.convertFtoC(parameter), 0.09);
    }

    @Test
    public void convertCtoF() {
        assertEquals(expected2, converter.convertCtoF(parameter), 0.07);
    }

    @Test
    public void convertKtoC() {
        assertEquals(parameter, converter.convertKtoC(expected1), 0.05);
    }

    @Test
    public void convertFtoK() {
        assertEquals(expected1, converter.convertFtoK(expected2), 0.09);
    }

    @Test
    public void convertKtoF() {
        assertEquals(expected2, converter.convertKtoF(expected1), 0.09);
    }
}