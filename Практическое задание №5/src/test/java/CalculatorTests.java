import Chisla.OneChislo;
import Chisla.TwoChislo;
import Operations.Division;
import Operations.Minus;
import Operations.Multiply;
import Operations.Plus;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {
    @Test
    public void checkCalculatorWithTwoPositiveNumbers(){
        OneChislo one = new OneChislo(3.6);
        TwoChislo two = new TwoChislo(4.0);
        Plus plus = new Plus();
        Minus minus = new Minus();
        Multiply multiply = new Multiply();
        Division division = new Division();
        Assert.assertEquals("3.6 + 4.0 = 7.6", 7.6, plus.operation(one, two), 0.001);
        Assert.assertEquals("3.6 - 4.0 = -0.4", -0.4, minus.operation(one, two), 0.001);
        Assert.assertEquals("3.6 * 4.0 = 14.4", 14.4, multiply.operation(one, two), 0.001);
        Assert.assertEquals("3.6 / 4.0 = 0.9", 0.9, division.operation(one, two), 0.001);
    }

    @Test
    public void checkCalculatorWithTwoNegativeNumbers(){
        OneChislo one = new OneChislo(-7.55);
        TwoChislo two = new TwoChislo(-1.4);
        Plus plus = new Plus();
        Minus minus = new Minus();
        Multiply multiply = new Multiply();
        Division division = new Division();
        Assert.assertEquals("-7.55 + -1.4 = -8.95", -8.95, plus.operation(one, two), 0.001);
        Assert.assertEquals("-7.55 - -1.4 = -6.15", -6.15, minus.operation(one, two), 0.001);
        Assert.assertEquals("-7.55 * -1.4 = 10.57", 10.57, multiply.operation(one, two), 0.001);
        Assert.assertEquals("-7.55 / -1.4 = 5.393", 5.393, division.operation(one, two), 0.001);
    }

    @Test
    public void checkCalculatorWithOnePositiveTwoNegativeNumbers(){
        OneChislo one = new OneChislo(100.1);
        TwoChislo two = new TwoChislo(-321.67);
        Plus plus = new Plus();
        Minus minus = new Minus();
        Multiply multiply = new Multiply();
        Division division = new Division();
        Assert.assertEquals("100.1 + -321.67 = -221.57", -221.57, plus.operation(one, two), 0.001);
        Assert.assertEquals("100.1 - -321.67 = 421.77", 421.77, minus.operation(one, two), 0.001);
        Assert.assertEquals("100.1 * -321.67 = -32199.167", -32199.167, multiply.operation(one, two), 0.001);
        Assert.assertEquals("100.1 / -321.67 = -0.311", -0.311, division.operation(one, two), 0.001);
    }

    @Test
    public void checkCalculatorWithOneZero(){
        OneChislo one = new OneChislo(0.0);
        TwoChislo two = new TwoChislo(23.34);
        Plus plus = new Plus();
        Minus minus = new Minus();
        Multiply multiply = new Multiply();
        Division division = new Division();
        Assert.assertEquals("0.0 + 23.34 = 23.34", 23.34, plus.operation(one, two), 0.001);
        Assert.assertEquals("0.0 - 23.34 = -23.34", -23.34, minus.operation(one, two), 0.001);
        Assert.assertEquals("0.0 * 23.34 = 0.0", 0.0, multiply.operation(one, two), 0.001);
        Assert.assertEquals("23.34 / 0.0 = 0/0", 0.0, division.operation(one, two), 0.001);
    }
}

