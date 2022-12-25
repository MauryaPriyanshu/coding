package BinarySearchProblem;
// Search element in the rotaed sorted Array
public class SearchElement {
    public static void main(String[] args){
        int nums[] = {4,5,6,7,0,1,2};
        int target = 1;
        findTarget(nums,target);
    }

    private static void findTarget(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                System.out.println("find target element at index of: " + mid);
                 
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && nums[mid] >= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[high] >= target && nums[mid] <= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            //System.out.println("target is not found int the roatated array!");
        }
        System.out.println("target is not found in the roatated array!");
    }
}
