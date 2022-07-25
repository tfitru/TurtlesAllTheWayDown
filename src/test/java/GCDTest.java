import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class GCDTest {

    @Test
    public void GCDTest_smallNumber() {
        // Given
        Integer number = 2;
        Integer number1 = 10;
        Integer expectedInteger = 2;
        GCD gc = new GCD(number, number1);
        // When
        Integer actualGCD = gc.GCD(number, number1);
        // Then
        Assert.assertEquals(expectedInteger, actualGCD);

    }

    @Test
    public void GCDTest_LargeNumber() {
        // Given
        Integer number = 50;
        Integer number1 = 500;
        Integer expectedInteger = 50;
        GCD gc = new GCD(number, number1);
        // When
        Integer actualGCD = gc.GCD(number, number1);
        // Then
        Assert.assertEquals(expectedInteger, actualGCD);

    }

    @Test
    public void GCDTest_LargeNumber1() {
        // Given
        Integer number = 500;
        Integer number1 = 5;

        Integer expectedInteger = 5;
        GCD gc = new GCD(number, number1);
        // When
        Integer actualGCD = gc.GCD(number, number1);
        // Then
        Assert.assertEquals(expectedInteger, actualGCD);

    }

    @Test
    public void GCDTest_Time() {

        Integer number = 500;
        Integer number1 = 5;
        Integer number2 = 5;
        Integer number3 = 250;
        GCD gc = new GCD(number, number1);
        GCD2 gcd2 = new GCD2(number2, number3);


        Instant start = Instant.now();
        gc.GCD(number, number1);
        Instant finish = Instant.now();
        System.out.println(start + " " + finish);

        Instant start1 = Instant.now();
        gcd2.GCD2(number2, number3);
        Instant finish1 = Instant.now();
        long timeElapsed2 = Duration.between(start1,finish1).toMillis();
        System.out.println(timeElapsed2);

    }




}
