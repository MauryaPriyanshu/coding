//******************************SEARCH ELEMENT IN THE ROTATED AND SORTED ARRAY******************

public class SearchElement {
    public static void  main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 6;

        int low = 0, high = nums.length - 1;

        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                System.out.println("Print the index of the element : " + mid);;
            }
            //FOR LEFT SORTED
            if(nums[low] < nums[mid]){
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid-1;
                }
                else {
                    low = mid + 1;
                }
            }
            // FOE RIGHT SORTING
            else{
                if(target >= nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        if(low>high){

        System.out.println("Element not found in the array");
        }
    }
}
