import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GoodPairsTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testGoodPairsTest() {
        GoodPairs goodPairs = new GoodPairs();
        Assert.assertEquals(4, goodPairs.numberOfPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    @After
    public void cleanUp() {
        System.setOut(null);
    }
}
