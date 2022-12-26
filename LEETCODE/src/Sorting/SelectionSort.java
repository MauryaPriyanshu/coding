package Sorting;

public class SelectionSort {
    public static void main(String[] args){
    int[] nums = {1,7,4,3,2,5};
    int n = nums.length;

    for(int i = 0; i < n- 1; i++){
        int min = i;
        for(int j = i+1; j < n; j++){
            if(nums[j] < nums[min]){
                min = j;
            }
        }
        if(min!= i){
            swap(nums,min,i);
        }

      }
        System.out.println("print the array after the sorting: ");
    for(int i = 0; i < nums.length; i++){
        System.out.print(nums[i] + ",");
    }
    }

    private static void swap(int[] nums, int min, int i) {
        int temp = nums[i];
        nums[i] = nums[min];
        nums[min] = temp;
    }
}
