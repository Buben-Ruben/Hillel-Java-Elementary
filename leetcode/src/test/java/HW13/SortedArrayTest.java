package HW13;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class SortedArrayTest {

    @Test
    public void testSortedArrayTest() {
        SortedArray sortedArray = new SortedArray();
        Assert.assertEquals("[0, 1, 9, 16, 100]", Arrays.toString(sortedArray.arrayToSquare(new int[] {-4,-1,0,3,10})));
    }
}
