import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class JewelsAndStonesTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testJewelsAndStones() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        Assert.assertEquals(3, jewelsAndStones.numberOfJewels("aA", "aAAbbbb"));
    }

    @After
    public void cleanUp() {
        System.setOut(null);
    }
}
