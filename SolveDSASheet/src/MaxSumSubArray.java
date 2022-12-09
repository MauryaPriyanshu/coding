//KADEN'S ALGORITHM
// TIME COMPLEXITY : O(n)

public class MaxSumSubArray {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("print the Original array :");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
        }
        System.out.println();

        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for(int i = 0; i < nums.length; i++){
            curSum = curSum + nums[i];
            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        System.out.println("Maximum Sum of the given SubArray is : " + maxSum);
    }
}
