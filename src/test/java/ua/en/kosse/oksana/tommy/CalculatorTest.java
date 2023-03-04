package ua.en.kosse.oksana.tommy;


import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {
    private static final double RESULT_Division = 1.5;
    private Divisioncalc testDivisioncalc = Mockito.mock(Divisioncalc.class);

    @Test
    public void VerifySimpleDivisioncalcMockito() {
        double result = Calculator.calc(3, 2, '/');
        Assert.assertEquals(RESULT_Division, result, 0.0);
    }
    @Test
    public void VerifySimpleDivisioncalc() {
        double result = Calculator.calc(3, 2, '/');
        Assert.assertEquals(RESULT_Division, result, 0.0);
    }

    @Test
    public void VerifySimpleMinuscalc() {
        double result0 = Calculator.calc(1234561.00, 2, '-');
        Assert.assertEquals(1234559.0, result0, 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void VerifySimpleDivisioncalcZero() {
        double result1 = Calculator.calc(3, 0, '/');
        Assert.assertEquals(2.0, result1, 0.0);
    }

    @Test
    public void VerifySimpleBigNumbers() {
        double result3 = Calculator.calc(12345678901234567.00, 1, '*');
        Assert.assertEquals(12345678901234567.00, result3, 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void VerifySimpleOperationNotRecognized() {
        double result4 = Calculator.calc(4, 2, '^');
        Assert.assertEquals(16, result4, 0.0);
    }
}
