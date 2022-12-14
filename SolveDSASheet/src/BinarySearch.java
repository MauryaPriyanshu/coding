
public class BinarySearch {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int item = 11;
        binarySearch(nums,item);
    }
    public static void binarySearch(int nums[], int item){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == item){
                System.out.println("Item is fount at ithe index of :" + mid);
                break;
            }
            else if (nums[mid] < item) {
                 low = mid + 1;

            }
            else {
                high = mid -1;

            }
        }
        if(low>high){
            System.out.println("Item is not found in the given array!!");
        }

    }
}
