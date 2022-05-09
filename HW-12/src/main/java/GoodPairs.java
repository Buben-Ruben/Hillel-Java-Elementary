public class GoodPairs {

    public int numberOfPairs(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1;j < nums.length; j++) {
                if(nums[i] == nums[j]) num++;
            }
        }
        return num;
    }
}
