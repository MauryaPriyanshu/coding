

public class LinearSearch {
    public static void main(String[] args){
        int arr[] = {11,24,3,4,52,6,70,8};
        int target = 70;
        linearSearch(arr,target);
    }

    private static void linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element present in the intex " + i);
                return;
            }
        }

                System.out.println("Element not present in  the array!");

        }
    }

