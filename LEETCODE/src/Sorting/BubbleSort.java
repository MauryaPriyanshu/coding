package Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int nums[] = {10,3,7,1,9,2,5,6};
        for(int i = 0; i < nums.length- 1; i++){
            boolean swapped = false;
            for(int j = 0; j < nums.length-i-1; j++){
                if(nums[j+1] < nums[j]){
                    swapped = true;
                    swap(nums,j+1,j);
                }
            }
            if(!swapped ){
                break;
            }
       }
        System.out.println("print the array after the sorting : ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
        }

    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
