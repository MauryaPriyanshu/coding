
// WAP TO FIND THE DUPLICATE ELEMENT IN THE ARRAY

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args){
        int[] nums = {1,2,3,1,2,4,6,8,3};

        System.out.println("Print the original array: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
        }
        System.out.println();


//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1; j < nums.length; j++){
//                if(nums[i] == nums[j])
//                    System.out.println("The Duplicate element is :" + nums[i]);
//            }
//        }

        HashSet<Integer> hashSet = new HashSet<>();
        for(int array : nums) {
            hashSet.add(array);
        }
            if(hashSet.size() != nums.length){
                System.out.println("Array have duplicate element");
            }
            else{
                System.out.println("Array have no duplicate element");
            }

    }
}
