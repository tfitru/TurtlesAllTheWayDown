import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void factorialMethod() {
        // Given
        Integer three  = 3;
        Factorial factorial = new Factorial(three);
        Integer expectedFactorial = 6;
        // When
        factorial.factorialMethod(three);
        // Then
        Assert.assertEquals(factorial.factorialMethod(three), expectedFactorial);
    }

    @Test
    public void factorialMethod_LargerNumber() {
        // Given
        Integer largerNumber  = 5;
        Factorial factorial = new Factorial(largerNumber);
        Integer expectedFactorial = 120;
        // When
        Integer actualFactorial = factorial.factorialMethod(largerNumber);
        // Then
        Assert.assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    public void factorialMethod_Zero() {
        // Given
        Integer largerNumber  = 0;
        Factorial factorial = new Factorial(largerNumber);
        Integer expectedFactorial = 1;
        // When
        Integer actualFactorial = factorial.factorialMethod(largerNumber);
        // Then
        Assert.assertEquals(expectedFactorial, actualFactorial);
    }


}
