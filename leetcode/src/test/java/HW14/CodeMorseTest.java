package HW14;

import org.junit.Assert;
import org.junit.Test;

public class CodeMorseTest {

    @Test
    public void testCodeMorseTest() {
        CodeMorse codeMorse = new CodeMorse();
        Assert.assertEquals(1, codeMorse.morseEncryption(new String[]{"a"}));
    }
}
