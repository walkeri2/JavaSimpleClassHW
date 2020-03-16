import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Test
    public void canAdd(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void canSub(){
        Calculator calculator = new Calculator();
        assertEquals( 3, calculator.sub(6,3));
    }

    @Test
    public void canMult(){
        Calculator calculator = new Calculator();
        assertEquals( 8, calculator.mult(2, 4));
    }

    @Test
    public void canDiv(){
        Calculator calculator = new Calculator();
        assertEquals( 4, calculator.div(8, 2), 0.01);
    }
}
