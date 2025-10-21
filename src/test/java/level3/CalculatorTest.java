import level3.model.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addTest() {
        float a = 5;
        float b = 5;
        float result = calculator.add(a, b);
        assertThat(result).isEqualTo(10);
    }

    @Test
    void substractTest() {
        float a = 5;
        float b = 5;
        float result = calculator.substract(a, b);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void mulTest() {
        float a = 5;
        float b = 5;
        float result = calculator.mul(a, b);
        assertThat(result).isEqualTo(25);
    }

    @Test
    void divTest() {
        float a = 5;
        float b = 5;
        float result = calculator.div(a, b);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void divByZero(){
            float a= 5;
            float b = 0;
            float result = calculator.div(a, b);
            assertThat(result).isEqualTo(Float.POSITIVE_INFINITY);

    }
}
