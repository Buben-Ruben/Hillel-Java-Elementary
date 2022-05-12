package HW13;

import java.util.Arrays;

public class SortedArray {

    public int[] arrayToSquare(int[] arr) {
        for (int i = 0; i < arr.length; i++) arr[i] *= arr[i];
        Arrays.sort(arr);
        return arr;
    }
}
