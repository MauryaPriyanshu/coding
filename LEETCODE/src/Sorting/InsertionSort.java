package Sorting;

public class InsertionSort {
    public static void main(String[] args){
        int[] nums = {8,4,2,6,5,3,1};
        for(int i = 1; i < nums.length; i++){
            int temp = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }
        System.out.println("print the array after the sorting");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
        }

    }
}
