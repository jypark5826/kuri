package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setting() {
        calculator = new Calculator();
    }

    @Test
    void splitTest() {
        List<String> result = calculator.split("1:2,3");
        assertEquals(result, Arrays.asList("1", "2", "3"));
    }

    @Test
    void changeTest() {
        assertThat(calculator.change(Arrays.asList("1", "2", "3"))).hasOnlyElementsOfType(Integer.class);
    }

    @Test
    void sumTest(){
        assertThat(calculator.sum(calculator.change(Arrays.asList("1", "2", "3")))).isEqualTo(6);
    }

    @Test
    void extractTest() {
        String s = "//;\n1;2;3;";
        assertThat(calculator.extract(s)).isEqualTo(6);
    }

    @Test
    void exceptionTest() {
        assertThatThrownBy(() -> {
            calculator.sum(calculator.change(calculator.split("-1,2,3")));
        }).isInstanceOf(RuntimeException.class);






    }
}

