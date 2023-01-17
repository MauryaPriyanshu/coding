package CompetativeProgramming;

public class CheckSortedArray {
    public static void main(String[] args){
        int arr[] = {2,3,4,5,6,7};
        System.out.println("Print array is sorted in asending order or not : ");
        asendingOrderSortedArray(arr);
    }

    public static void asendingOrderSortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println("No");
                }
            }
        }
        System.out.println("yes");
    }
}
