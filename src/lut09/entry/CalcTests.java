package lut09.entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class CalcTests {

    private final Calculator calc;
    //dlaczego te zmienne sa private?
    private final int first;
    private final int second;
    private final int sum;

    public CalcTests(int first, int second, int sum) {
        calc = new Calculator();
        this.first = first;
        this.second = second;
        this.sum = sum;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 3, 5}, {9, 8, 17}
        });
    }

    @Test
    public void sumOfTwo() {
        int result = calc.add(first, second);
        assertEquals(sum, result);
    }
}
