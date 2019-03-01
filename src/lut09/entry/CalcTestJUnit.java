package lut09.test.java.pl.sda.entry;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lut09.main.java.pl.sda.entry.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalcTestJUnit {

    private Calculator calc;

    @Test
    @Parameters({
            "2,3,5",
            "4,1,5"
    })

    public void sumOFTwo(int first, int second, int sum) {
        calc = new Calculator();
        int result = calc.add(first, second);
        assertEquals(sum, result);
    }
}
