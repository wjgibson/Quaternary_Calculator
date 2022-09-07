import model.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class calculator_test {
    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        Assertions.assertEquals(Integer.parseInt("30",4), calc.add("11", "13"));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(Integer.parseInt("2", 4), calc.subtract("11", "3"));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(Integer.parseInt("111", 4), calc.multiply("13", "3"));
    }

    @Test
    void testDivide(){
        Assertions.assertEquals(Integer.parseInt("3", 4), calc.divide("12", "2"));
    }

}
