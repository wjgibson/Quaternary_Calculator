import model.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    Calculator calc = new Calculator('+', "11", "13");

    @Test
    void testAdd() {
        Assertions.assertEquals(Integer.parseInt("30",4), calc.calculate());
    }

    @Test
    void testSubtract() {
        calc.setOperator('-');
        calc.setOperands("11", "3");
        Assertions.assertEquals(Integer.parseInt("2", 4), calc.calculate());
    }

    @Test
    void testMultiply() {
        calc.setOperands("13", "3");
        calc.setOperator('*');
        Assertions.assertEquals(Integer.parseInt("111", 4), calc.calculate());
    }

    @Test
    void testDivide() {
        calc.setOperator('/');
        calc.setOperands("12", "2");
        Assertions.assertEquals(Integer.parseInt("3", 4), calc.calculate());
    }

    @Test
    void testSquare() {
        calc.setOperator('s');
        calc.setOperands("13", "0");
        Assertions.assertEquals(Integer.parseInt("301", 4), calc.calculate());
    }

    @Test
    void testSquareRoot() {
        calc.setOperator('r');
        calc.setOperands("21", "0");
        Assertions.assertEquals(Integer.parseInt("3", 4), calc.calculate());
    }
}
