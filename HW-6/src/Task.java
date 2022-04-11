import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int freq = 0;
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0) freq += nums[i];
        }
        int[] arr = new int[freq];
        for (int i = 1; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i-1]; j++) {
                arr[val++] = nums[i];
            }
        }
        System.out.println("\nInput:\t"+Arrays.toString(nums)+"\nOutput:\t"+Arrays.toString(arr));

    }

}
