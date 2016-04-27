import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by akalanka on 1/16/16.
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        Assert.assertNotNull(calculator.add(1L, 2L));
        Assert.assertEquals(calculator.add(1L, 2L), 3L);
    }
}
