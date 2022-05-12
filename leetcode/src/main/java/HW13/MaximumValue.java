package HW13;

public class MaximumValue {

    public int maxSolution(int[] arr) {
        int num = 0;
        int max = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                num = (arr[i] - 1) * (arr[j] - 1);
                if (num > max) max = num;
            }
        }
        return max;
    }
}
