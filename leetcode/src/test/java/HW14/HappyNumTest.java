package HW14;

import org.junit.Assert;
import org.junit.Test;

public class HappyNumTest {

    @Test
    public void testHappyNumTest() {
        HappyNum happyNum = new HappyNum();
        Assert.assertEquals(true, happyNum.isHappy(19));
    }
}
