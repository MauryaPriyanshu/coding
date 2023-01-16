package CompetativeProgramming;

//Time Complexity is : O(n);

public class LargestAndSecondLargestElement {
    public static void main(String[] args){
        int[] arr = {2,5,1,3,8,6};

        System.out.println("Print the original element int the array:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ,");
        }
        System.out.println();

        int arrMax = arr[0];
        int second_max = arr[0];

        for(int i = 0; i < arr.length; i++){
            arrMax = Math.max(arrMax, arr[i]);
        }
        System.out.println("Print the maximum element in the given array is : " + arrMax);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > second_max && arr[i] != arrMax){
                second_max = arr[i];
            }
        }
        System.out.println("Print the largest element in the array is : " + second_max);

    }
}
