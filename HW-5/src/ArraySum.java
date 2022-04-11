import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arrSum = new int[arr.length];
        arrSum[0]=arr[0];
        for (int i = 1; i < arr.length; i++)
            arrSum[i] = arrSum[i-1] + arr[i];
        System.out.println("\nInput:\t"+Arrays.toString(arr)+"\nOutput:\t"+Arrays.toString(arrSum));
    }
}
