import org.example.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    //Dynamic Test
    @TestFactory
    Collection<DynamicTest> dynamicTestsForAddition() {
        return Arrays.asList(
                DynamicTest.dynamicTest("1 + 1 = 2", () -> assertEquals(2, new Calculator().add(1, 1))),
                DynamicTest.dynamicTest("2 + 3 = 5", () -> assertEquals(5, new Calculator().add(2, 3))),
                DynamicTest.dynamicTest("-1 + 1 = 0", () -> assertEquals(0, new Calculator().add(-1, 1)))
        );
    }

    static Stream<Arguments> additionProvider() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(2, 3, 5),
                Arguments.of(-1, 1, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("additionProvider")
    public void testAdd(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.add(a, b));
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, calculator.add(-1, 1), "-1 + 1 should equal 0");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(-1, calculator.subtract(2, 3), "2 - 3 should equal -1");
    }
}
