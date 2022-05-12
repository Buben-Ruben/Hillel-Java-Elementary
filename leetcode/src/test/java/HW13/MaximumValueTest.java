package HW13;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {

    @Test
    public void testMaximumValueTest() {
        MaximumValue maximumValue = new MaximumValue();
        Assert.assertEquals(12, maximumValue.maxSolution(new int[]{3,4,5,2}));
    }
}
