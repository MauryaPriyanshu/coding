//CHOCOLATE DISTRIBUTION

import java.util.Arrays;

public class FindMinDiff {
    public static void main(String[] args){
        int[] nums = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println("Minimum Difference is : "+ findminDiff(nums,m));
    }

    public static int findminDiff(int[] nums, int m) {
        if(m == 0 || nums.length == 0)
            return 0;

        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i+m-1 < nums.length; i++){
            int diff = nums[i+m-1] - nums[i];

            if(minDiff > diff){
                minDiff = diff;
            }

        }
        return minDiff;
    }
}
